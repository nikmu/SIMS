package org.bme.basic.service.impl;

import java.util.List;

import org.bme.basic.model.ZxxxbModel;
import org.bme.basic.service.CentreInforService;
import org.bme.common.dao.BaseDao;
import org.bme.common.entity.Gwxxb;
import org.bme.common.entity.Yhgwglxxb;
import org.bme.common.entity.Yhxxb;
import org.bme.common.entity.Zxxxb;
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
 * 类名称：CentreInforServiceImpl   
 * 类描述：
 * 创建人：张俊   
 * 创建时间：2016年3月10日 下午9:00:58   
 * 修改人：张俊   
 * 修改时间：2016年3月10日 下午9:00:58   
 * 修改备注：   
 * @version 1.0  
 *
 */
@Service
public class CentreInforServiceImpl<T> implements CentreInforService<T> {
	@Autowired 
	private BaseDao<Zxxxb> baseDao;
	@Autowired
	private BaseDao<Yhxxb> yhxxbDao;
	@Autowired
	private BaseDao<Gwxxb> gwxxbDao;
	@Autowired
	private BaseDao<Yhgwglxxb> yhgwglxxbDao;
	//查询用DAO
	@Autowired
	private BaseDao<ZxxxbModel> zxxxbDao;

	@Override
	public Zxxxb addZxxxb(Zxxxb zxxxb) {
		return baseDao.add(zxxxb);
	}

	@Override
	public boolean updateZxxxb(Zxxxb zxxxb) {
		return baseDao.update(zxxxb);
	}

	@Override
	public boolean deleteZxxxb(String primaryKeys) {
		return baseDao.delete("delete Zxxxb where zxbh in(:ids)",Util.aliasGenerate(primaryKeys));
	}

	@Override
	public PageModel<ZxxxbModel> generalQueryZxxxb(ConditionQueryModel cqModel) throws Exception {
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String queryCondition = cqModel.getQuery();
		ZxxxbModel zxxxbModel = new ZxxxbModel();
		String hql = GeneratorHQL.generalQueryHQL(zxxxbModel, "Zxxxb",
				queryCondition);
		PageModel<ZxxxbModel> pageModel = zxxxbDao.getPageModel(hql);
		return pageModel;
	}

	@Override
	public PageModel<ZxxxbModel> exactQueryZxxxb(ConditionQueryModel cqModel)
			throws Exception {
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String paramPairs = cqModel.getParamPairs();
		ZxxxbModel zxxxbModel = new ZxxxbModel();
		String hql = GeneratorHQL.exactQueryHQL(zxxxbModel, "Zxxxb",
				paramPairs);
		return zxxxbDao.getPageModel(hql);
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

	@Override//没用
	public List<Yhgwglxxb> getYhgwglxxb(String gwhb) throws Exception{
		String hql = "select p from Yhgwglxxb p where p.gwxxb ='"+gwhb+"'";
		return yhgwglxxbDao.getList(hql);
	}
	@Override
	public List<Yhxxb> getYhxxbByZxbhAndGwmc(String zxbh, String gwmc){
//		String hql = "select p from Yhxxb p where p.ssjgbh = '"+zxbh+"' "
//				+ "and p.yhbh in ("
//				+ "select o.yhxxb.yhbh from Yhgwglxxb o where o.gwxxb.gwbh = ("
//				+ "select g.gwbh from Gwxxb g where gwmc = '"+gwmc+"'))";
		
		String sql = "select * from C##SIMSDBA.YHXXB p where p.ssjgbh = '"+zxbh+"' "
				+ "and p.yhbh in ("
				+ "select o.yhbh from C##SIMSDBA.YHGWGLXXB o where o.gwbh = ("
				+ "select g.gwbh from C##SIMSDBA.GWXXB g where gwmc = '"+gwmc+"'))";
		List<Yhxxb> yhxxbs = yhxxbDao.getSQLList(sql);
		return yhxxbs;
	}
	
}
