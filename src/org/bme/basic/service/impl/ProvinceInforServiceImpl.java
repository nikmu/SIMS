package org.bme.basic.service.impl;

import org.bme.basic.model.DqxxbModel;
import org.bme.basic.model.ShfxxbModel;
import org.bme.basic.model.XfxxbModel;
import org.bme.basic.service.ProvinceInforService;
import org.bme.common.dao.BaseDao;
import org.bme.common.entity.Dqxxb;
import org.bme.common.entity.Shfxxb;
import org.bme.common.entity.Xfxxb;
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
 * 类名称：ProvinceInforServiceImpl   
 * 类描述：ProvinceInforService实现类
 * 创建人：张俊   
 * 创建时间：2016年3月8日 下午3:34:13   
 * 修改人：张俊   
 * 修改时间：2016年3月8日 下午3:34:13   
 * 修改备注：   
 * @version 1.0  
 *
 */
@Service
public class ProvinceInforServiceImpl<T> implements ProvinceInforService<T> {

	@Autowired
	private BaseDao<Shfxxb> shfxxbDao;
	@Autowired
	private BaseDao<Dqxxb> dqxxbDao;
	@Autowired
	private BaseDao<Xfxxb> xfxxbDao;
	@Autowired
	private BaseDao<ShfxxbModel> shfxxbQueryDao;
	@Autowired
	private BaseDao<DqxxbModel> dqxxbQueryDao;
	@Autowired
	private BaseDao<XfxxbModel> xfxxbQueryDao;
	
	GeneratorHQL geneHQL = new GeneratorHQL();
	
	@Override
	public Shfxxb addShfxxb(Shfxxb shfxxb) {
		return shfxxbDao.add(shfxxb);
	}

	@Override
	public boolean updateShfxxb(Shfxxb shfxxb) {
		return shfxxbDao.update(shfxxb);
	}
	
	@Override
	public boolean deleteShfxxb(String primaryKeys) {
		return shfxxbDao.delete("delete Shfxxb where sfbh in(:ids)",Util.aliasGenerate(primaryKeys));
	}
	
	@Override
	public Dqxxb addDqxxb(Dqxxb dqxxb) {
		return dqxxbDao.add(dqxxb);
	}

	@Override
	public boolean updateDqxxb(Dqxxb dqxxb) {
		return dqxxbDao.update(dqxxb);
	}
	
	@Override
	public boolean deleteDqxxb(String primaryKeys) {
		return dqxxbDao.delete("delete Dqxxb where dqbh in(:ids)",Util.aliasGenerate(primaryKeys));
	}
	
	@Override
	public Xfxxb addXfxxb(Xfxxb xfxxb) {
		return xfxxbDao.add(xfxxb);
	}

	@Override
	public boolean updateXfxxb(Xfxxb xfxxb) {
		return xfxxbDao.update(xfxxb);
	}
	
	@Override
	public boolean deleteXfxxb(String primaryKeys) {
		return xfxxbDao.delete("delete Xfxxb where xfbh in(:ids)",Util.aliasGenerate(primaryKeys));
	}
	
	@Override
	public PageModel<ShfxxbModel> generalQueryShfxxb(ConditionQueryModel cqModel) throws Exception {
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String queryCondition = cqModel.getQuery();
		ShfxxbModel shfxxbModel = new ShfxxbModel();
		String hql = GeneratorHQL.generalQueryHQL(shfxxbModel, "Shfxxb",
				queryCondition);
		PageModel<ShfxxbModel> pageModel = shfxxbQueryDao.getPageModel(hql);
		return pageModel;
	}
	
	@Override
	public PageModel<ShfxxbModel> exactQueryShfxxb(ConditionQueryModel cqModel) throws Exception {
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String paramPairs = cqModel.getParamPairs();
		ShfxxbModel shfxxbModel = new ShfxxbModel();
		String hql = GeneratorHQL.exactQueryHQL(shfxxbModel, "Shfxxb",
				paramPairs);
		return shfxxbQueryDao.getPageModel(hql);
	}

	@Override
	public PageModel<DqxxbModel> generalQueryDqxxb(ConditionQueryModel cqModel) throws Exception {
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String queryCondition = cqModel.getQuery();
		DqxxbModel dqxxbModel = new DqxxbModel();
		String hql = GeneratorHQL.generalQueryHQL(dqxxbModel, "Dqxxb",
				queryCondition);
		PageModel<DqxxbModel> pageModel = dqxxbQueryDao.getPageModel(hql);
		return pageModel;
	}

	@Override
	public PageModel<DqxxbModel> exactQueryDqxxb(ConditionQueryModel cqModel) throws Exception {
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String paramPairs = cqModel.getParamPairs();
		DqxxbModel dqxxbModel = new DqxxbModel();
		String hql = GeneratorHQL.exactQueryHQL(dqxxbModel, "Dqxxb",
				paramPairs);
		return dqxxbQueryDao.getPageModel(hql);
	}

	@Override
	public PageModel<XfxxbModel> generalQueryXfxxb(ConditionQueryModel cqModel) throws Exception {
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String queryCondition = cqModel.getQuery();
		XfxxbModel xfxxbModel = new XfxxbModel();
		String hql = GeneratorHQL.generalQueryHQL(xfxxbModel, "Xfxxb",
				queryCondition);
		PageModel<XfxxbModel> pageModel = xfxxbQueryDao.getPageModel(hql);
		return pageModel;
	}

	@Override
	public PageModel<XfxxbModel> exactQueryXfxxb(ConditionQueryModel cqModel) throws Exception {
		SystemContextModel.setOrder(cqModel.getOrder());
		SystemContextModel.setSort(cqModel.getSort());
		SystemContextModel.setLimit(cqModel.getLimit());
		SystemContextModel.setOffset(cqModel.getOffset());
		String paramPairs = cqModel.getParamPairs();
		XfxxbModel xfxxbModel = new XfxxbModel();
		String hql = GeneratorHQL.exactQueryHQL(xfxxbModel, "Xfxxb",
				paramPairs);
		return xfxxbQueryDao.getPageModel(hql);
	}
}
