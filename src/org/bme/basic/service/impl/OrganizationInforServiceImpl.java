package org.bme.basic.service.impl;

import java.util.List;

import org.bme.basic.model.DwxxbModel;
import org.bme.basic.service.OrganizationInforService;
import org.bme.common.dao.BaseDao;
import org.bme.common.entity.Dwxxb;
import org.bme.common.entity.Gwxxb;
import org.bme.common.entity.Yhgwglxxb;
import org.bme.common.entity.Yhxxb;
import org.bme.common.model.ConditionQueryModel;
import org.bme.common.model.PageModel;
import org.bme.common.model.SystemContextModel;
import org.bme.common.utils.Util;
import org.bme.common.utils.hql.GeneratorHQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：OrganizationInforServiceImpl   
 * 类描述：单位service实例
 * 创建人：朱俊杰   
 * 创建时间：Mar 15, 2016 3:22:38 PM   
 * 修改人：朱俊杰   
 * 修改时间：Mar 15, 2016 3:22:38 PM   
 * 修改备注：   
 * @version 1.0  
 *
 */
@Service
public class OrganizationInforServiceImpl<T> implements OrganizationInforService<T> {

	@Autowired 
	private BaseDao<Dwxxb> baseDao;
	@Autowired
	private BaseDao<DwxxbModel> DwxxbDao;
	@Autowired
	private BaseDao<Yhxxb> yhxxbDao;
	@Autowired
	private BaseDao<Gwxxb> gwxxbDao;
	@Autowired
	private BaseDao<Yhgwglxxb> yhgwglxxbDao;
	
	@Override
	public Dwxxb addDwxxb(Dwxxb dwxxb) {
		return baseDao.add(dwxxb);
	}

	@Override
	public boolean updateDwxxb(Dwxxb dwxxb) {
		return baseDao.update(dwxxb);
	}

	@Override
	public boolean deleteDwxxb(String primaryKeys) {
		return baseDao.delete("delete Dwxxb where dwbh in(:ids)",Util.aliasGenerate(primaryKeys));
	}

	@Override
	public PageModel<DwxxbModel> generalQueryDwxxb(ConditionQueryModel cqModel) throws Exception {
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String queryCondition = cqModel.getQuery();
		DwxxbModel dwxxbModel = new DwxxbModel();
		String hql = GeneratorHQL.generalQueryHQL(dwxxbModel, "Dwxxb",
				queryCondition);
		PageModel<DwxxbModel> pageModel = DwxxbDao.getPageModel(hql);
		return pageModel;
	}

	@Override
	public PageModel<DwxxbModel> exactQueryDwxxb(ConditionQueryModel cqModel) throws Exception{
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String paramPairs = cqModel.getParamPairs();
		DwxxbModel dwxxbModel = new DwxxbModel();
		String hql = GeneratorHQL.exactQueryHQL(dwxxbModel, "Dwxxb",
				paramPairs);
		return DwxxbDao.getPageModel(hql);
	}
	
	@Override
	public Yhxxb addYhxxb(Yhxxb yhxxb) {
		return yhxxbDao.add(yhxxb);
	}

	@Override
	public boolean updataYhxxb(Yhxxb yhxxb) {
		return yhxxbDao.updateImport(yhxxb);
	}
	
	@Override
	public Gwxxb getGwxxb(String string) throws Exception {
		String hql = "select p from Gwxxb p where p.gwmc like '%"+string+"%'";
		return gwxxbDao.getObject(hql);
	}
	
	@Override
	public Yhgwglxxb addYhgwglxxb(Yhgwglxxb yhgwglxxb){
		return yhgwglxxbDao.add(yhgwglxxb);
	}
	
	@Override
	public List<Yhxxb> getYhxxbByDwbhAndGwmc(String dwbh, String gwmc){
		
		String sql = "select * from C##SIMSDBA.YHXXB p where p.ssjgbh = '"+dwbh+"' "
				+ "and p.yhbh in ("
				+ "select o.yhbh from C##SIMSDBA.YHGWGLXXB o where o.gwbh = ("
				+ "select g.gwbh from C##SIMSDBA.GWXXB g where gwmc = '"+gwmc+"'))";
		List<Yhxxb> yhxxbs = yhxxbDao.getSQLList(sql);
		return yhxxbs;
	}
}
