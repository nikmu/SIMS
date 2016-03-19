package org.bme.common.dao.impl;

//import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bme.common.dao.BaseDao;
import org.bme.common.model.AddScalar;
import org.bme.common.model.PageModel;
import org.bme.common.model.SystemContextModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T> {
//	private static final String SAVESUCCESS = "{\"success\":true,msg:'保存数据成功！'}";
//	private static final String SAVEFAILURE = "{\"success\":false,msg:'保存数据失败！'}";

	private static final String UPDATESUCCESS = "{\"success\":true,msg:'更新数据成功！'}";
	private static final String UPDATEFAILURE = "{\"success\":false,msg:'更新数据失败！'}";

	private static final String DELETESUCCESS = "{\"success\":true,msg:'删除数据成功！'}";
	private static final String DELETEFAILURE = "{\"success\":false,msg:'删除数据失败！'}";
	
	@Autowired
	private SessionFactory sessionFactory;

	// *****************************************公共方法——start**************************************
	/**
	 * 公共方法————获得当前Session
	 */
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	/**
	 * 公共方法————使用HQL语句进行查询
	 */
	private Query getQuery(String hql) {
		return this.getSession().createQuery(hql);
	}

	/**
	 * 公共方法————使用SQL语句进行查询
	 */
	private SQLQuery getSQLQuery(String sql) {
		return this.getSession().createSQLQuery(sql);
	}

	/**
	 * 公共方法————使用SQL语句进行查询
	 */
	private Query getSQLQuery(String sql, Class<Object> beanclass,
			List<String> fieldList) {
		SQLQuery query = getSQLQuery(sql);
		AddScalar.addSclar(query, beanclass, fieldList);
		query.setResultTransformer(Transformers.aliasToBean(beanclass));
		return query;
	}

	/** 公共方法————对HQL语句查询，进行查询条件的参数设定
	 * 
	 */
	public void setParameter(Query query, Object[] args) {
		if (args != null && args.length > 0) {
			int index = 0;
			for (Object arg : args) {
				query.setParameter(index++, arg);
			}
		}
	}

	/**
	 * 公共方法————设置别名
	 * 
	 * select u from User u where i.id in(:uid)
	 * 
	 * @param query
	 * @param alias
	 */
	@SuppressWarnings("rawtypes")
	public void setAliasParameter(Query query, Map<String, Object> alias) {
		if (alias != null) {
			Set<String> keys = alias.keySet();
			for (String key : keys) {
				Object val = alias.get(key);
				if (val instanceof Collection) {
					// 查询条件是列表
					query.setParameterList(key, (Collection) val);
				} else {
					query.setParameter(key, val);
				}
			}
		}
	}

	/** 公共方法————使用HQL语句或SQL语句查询记录的总条数
	 * 
	 *  2016.01.23更新
	 */
	public String getCountHql(String hql, boolean isHql) {
		String endStr = hql.substring(hql.indexOf("from"));
		String countStr = "select count(*) " + endStr;
		if (isHql)
			countStr.replaceAll("fetch", "");
		return countStr;
	}

	/**
	 * 公共方法————使用SQL语句或SQL语句查询记录的总条数
	 */
	public String getCountSql(String sql) {
		return "select count(*) from (" + sql + ")";
	}
	
	/** 公共方法————（新）设置分页查询，即当前页和每页显示的最多条数
	 * @param query
	 * @param pages
	 */
	@SuppressWarnings("rawtypes")
	private void setPagers(Query query, PageModel pages) {
		Integer limit = SystemContextModel.getLimit();
		Integer offset = SystemContextModel.getOffset();
		if (offset == null || offset < 0) {
			offset = 0;
		}
		if (limit == null || limit < 0) {
			// 默认每页显示15条数据
			limit = 15;
		}
		pages.setOffset(offset);
		pages.setLimit(limit);
		query.setFirstResult(offset);
		query.setMaxResults(limit);
	}

	/** 公共方法————（旧）设置分页查询，即当前页和每页显示的最多条数
	 * 
	 */
	public void setPage(Query query, int page, int limit) {
		if (page == -1 || limit == -1) {
			return;
		}
		query.setFirstResult((page - 1) * limit);
		query.setMaxResults(limit);
	}
	
	/** 添加排序
	 * 
	 * @param hql
	 * @return
	 */
	private String initSort(String hql) {
		String order = SystemContextModel.getOrder();
		String sort = SystemContextModel.getSort();
		if (sort != null && !"".equals(sort.trim())) {
			hql += " order by " + sort;
			if (!"desc".equals(order))
				hql += " asc";
			else
				hql += " desc";
		}
		return hql;
	}

	// *****************************************公共方法——end****************************************

	/**
	 * 查询，不带分页——————HQL语句，不含条件的查询
	 */
	public List<T> getList(String hql) {
		return this.getQuery(hql).list();
	}

	public List<T> getList(String hql, Object[] values) {
		Query query = this.getQuery(hql);
		setParameter(query, values);
		return query.list();
	}

	@Override
	public List<T> getSQLList(String sql) {
		return getSQLQuery(sql).list();
	}

	/**
	 * 查询，不带分页——————SQL语句，通用查询
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List<T> getSQLList(String sql, String Path, List<String> fieldList) {
		Class beanclass = null;
		try {
			beanclass = Class.forName(Path);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return this.getSQLQuery(sql, beanclass, fieldList).list();
	}

	public List<T> getList(String hql, Map<String, Object> alias) {
		return this.getList(hql, new Object[] {}, alias);
	}

	/**
	 * 查询，不带分页——————HQL语句，含条件的查询,含别名 select u from User u where u.id in(:uid)
	 * and u.role=?
	 */
	public List<T> getList(String hql, Object[] values,
			Map<String, Object> alias) {
		Query query = this.getQuery(hql);
		this.setAliasParameter(query, alias);
		this.setParameter(query, values);
		return query.list();
	}
	

	@Override
	public PageModel<T> getPageModel(String hql, Object[] args) {
		return this.getPageModel(hql, args, null);
	}

	@Override
	public PageModel<T> getPageModel(String hql, Object arg) {
		return this.getPageModel(hql, new Object[] { arg });
	}

	@Override
	public PageModel<T> getPageModel(String hql) {
		return this.getPageModel(hql, null);
	}

	@Override
	public PageModel<T> getPageModelByAlias(String hql,
			Map<String, Object> alias) {
		return this.getPageModel(hql, null, alias);
	}

	@Override
	public PageModel<T> getPageModel(String hql, Object[] args,
			Map<String, Object> alias) {
		hql = initSort(hql);
		String cq = getCountHql(hql, true);
		Query cquery = getSession().createQuery(cq);
		Query query = getSession().createQuery(hql);
		// 设置别名参数
		setAliasParameter(query, alias);
		setAliasParameter(cquery, alias);
		// 设置参数
		setParameter(query, args);
		setParameter(cquery, args);
		PageModel<T> pages = new PageModel<T>();
		setPagers(query, pages);
		List<T> datas = query.list();
		pages.setDatas(datas);
		long total = (Long) cquery.uniqueResult();
		pages.setTotal(total);
		return pages;
	}
	
//	public PageModel<T> getPageModel(String hql, Object[] values, int page,
//			int limit) {
//		PageModel<T> pm = new PageModel<T>();
//		Query squery = this.getQuery(hql);
//		Query cquery = this.getQuery(this.getCountHql(hql));
//		this.setParams(squery, values);
//		this.setParams(cquery, values);
//		this.setPage(squery, page, limit);
//		int total = ((Long) cquery.uniqueResult()).intValue();
//		pm.setTotal(total);
//		pm.setList(squery.list());
//		return pm;
//	}
//
//	public PageModel<T> getPageModel(String hql, int page, int limit) {
//		return this.getPageModel(hql, new Object[] {}, page, limit);
//	}
//
//	/**
//	 * 查询，带分页的——————HQL语句，不含条件的查询
//	 */
//	public PageModel<T> getPageModel(String hql, Map<String, Object> alias,
//			int page, int limit) {
//		return this.getPageModel(hql, new Object[] {}, alias, page, limit);
//	}
//
//	/**
//	 * 查询，带分页——————HQL语句，含条件的查询
//	 */
//	public PageModel<T> getPageModel(String hql, Object[] values,
//			Map<String, Object> alias, int page, int limit) {
//		PageModel<T> pm = new PageModel<T>();
//		Query cquery = this.getQuery(this.getCountHql(hql));
//		Query squery = this.getQuery(hql);
//		this.setParams(squery, values);
//		this.setAlias(squery, alias);
//		this.setPage(squery, page, limit);
//
//		this.setParams(cquery, values);
//		this.setAlias(cquery, alias);
//		int total = (Integer) cquery.uniqueResult();
//		pm.setTotal(total);
//		pm.setList(squery.list());
//		return pm;
//	}
//
//	/**
//	 * 查询，带分页————SQL语句，通用查询
//	 * 
//	 * @param sql
//	 *            sql语句（包括有无限制条件）
//	 * @param page
//	 *            当前页
//	 * @param limit
//	 *            每页显示的条数
//	 * @param beanclass
//	 *            查询上来List的所属类型，该属性用来转换成Json格式
//	 * @param fieldList
//	 *            所查询字段的名称。
//	 * @return
//	 */
//	@SuppressWarnings("rawtypes")
//	public PageModel<T> getSQLPageModel(String sql, int page, int limit,
//			String Path, List<String> fieldList) {
//		Class beanclass = null;
//		try {
//			beanclass = Class.forName(Path);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		PageModel<T> pm = new PageModel<T>();
//		Query squery = this.getSQLQuery(sql, beanclass, fieldList);
//		Query cquery = this.getSQLQuery(this.getCountSql(sql));
//		this.setPage(squery, page, limit);
//		List<BigDecimal> list = cquery.list();
//		int total = list.get(0).intValue();
//		pm.setTotal(total);
//		pm.setList(squery.list());
//		return pm;
//	}

	/**
	 * 查单个——————HQL语句，不含条件的查询
	 */
	public T getObject(String hql) {
		return this.getObject(hql, new Object[] {});
	}

	/**
	 * 查单个————根据一个id，查询对应的一条记录
	 */
//	@SuppressWarnings("rawtypes")
	public T getObject(Class<T> clazz, int id) {
		return (T) this.getSession().get(clazz, id);
	}

	/**
	 * 查单个——————HQL语句，含条件的查询 query.uniqueResult(): 如果查询结果有多个值则抛出错误；
	 * 如果查询结果有且只有一个值,返回一个object； 如果没值,返回null。
	 */
	public T getObject(String hql, Object[] values) {
		Query query = this.getQuery(hql);
		this.setParameter(query, values);
		return (T) query.uniqueResult();
	}

	/**
	 * 添加数据————增加model
	 *
	 *	2016.01.22修改
	 */
	@Override
	public T add(T t) {
		this.getSession().save(t);
		return t;
	}

	/**
	 * 添加数据————增加model
	 */
	public boolean addImport(Object t) {
		try {
			this.getSession().save(t);
			this.getSession().flush();
			this.getSession().clear();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 添加数据————增加model
	 */
	public boolean addRB(Object t) {
		try {
			this.getSession().save(t);
			this.getSession().flush();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 更新数据————根据model
	 */
	public boolean update(Object t) {
		try {
			this.getSession().update(t);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 更新数据————根据model
	 */
	public boolean updateRB(Object t) {
		try {
			this.getSession().merge(t);
//			this.getSession().update(t);
//			this.getSession().flush();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 更新数据————根据model
	 */
	public boolean updateImport(Object t) {
		try {
			this.getSession().update(t);
			this.getSession().flush();
			this.getSession().clear();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 更新数据————根据HQL语句，不含条件、不含别名更新
	 */
	public String update(String hql) {
		try {
			this.update(hql, null, new Object[] {});
			return UPDATESUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return UPDATEFAILURE;
		}
	}
	
	/**
	 * 更新数据————根据HQL语句，不含条件、不含别名更新
	 */
	public boolean updateRB(String hql) {
		try {
			this.update(hql, null, new Object[] {});
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 更新数据————根据model
	 */
	public boolean updateImport(String hql) {
		try {
			this.update(hql, null, new Object[] {});
			this.getSession().flush();
			this.getSession().clear();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 更新数据————根据HQL语句，含条件更新、不含别名更新
	 */
	public String update(String hql, Object[] values) {
		try {
			this.update(hql, null, values);
			return UPDATESUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return UPDATEFAILURE;
		}
	}

	/**
	 * 更新数据————根据HQL语句，不含条件、含别名更新
	 */
	public String update(String hql, Map<String, Object> alias) {
		try {
			this.update(hql, alias, new Object[] {});
			return UPDATESUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return UPDATEFAILURE;
		}
	}

	/**
	 * 更新数据————根据HQL语句，含条件、含别名更新
	 */
	public String update(String hql, Map<String, Object> alias, Object[] values) {
		try {
			Query query = this.getQuery(hql);
			this.setParameter(query, values);
			this.setAliasParameter(query, alias);
			query.executeUpdate();
			return UPDATESUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return UPDATEFAILURE;
		}
	}

	/**
	 * 删除数据————根据model
	 */
	public String delete(Object t) {
		try {
			this.getSession().delete(t);
			return DELETESUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return DELETEFAILURE;
		}
	}
	
	/**
	 * 删除数据————根据model
	 */
	public String deleteImport(Object t) {
		try {
			this.getSession().delete(t);
			this.getSession().flush();
			this.getSession().clear();
			return DELETESUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return DELETEFAILURE;
		}
	}

	/**
	 * 删除数据————根据HQL语句，不含条件、不含别名
	 * 
	 * 返回类型为String
	 */
	public String delete(String hql) {
		try {
			this.delete(hql, null, new Object[] {});
			return DELETESUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return DELETEFAILURE;
		}
	}
	
	/**
	 * 删除数据————根据HQL语句，不含条件、不含别名
	 * 
	 * 返回类型为String
	 */
	public boolean deleteImport(String hql) {
		try {
			this.delete(hql, null, new Object[] {});
			this.getSession().flush();
			this.getSession().clear();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 删除数据————根据HQL语句，不含条件、不含别名
	 * 
	 * 返回类型为boolean
	 */
	public boolean deleteRB(String hql) {
		try {
			Query query = this.getQuery(hql);
			query.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 删除数据————根据HQL语句，含条件、不含别名
	 */
	public String delete(String hql, Object[] values) {
		try {
			this.delete(hql, null, values);
			return DELETESUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return DELETEFAILURE;
		}
	}

	/**
	 * 删除数据————根据HQL语句，不含条件、含别名
	 */
	public boolean delete(String hql, Map<String, Object> alias) {
		try {
			this.delete(hql, alias, new Object[] {});
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 删除数据————根据HQL语句，含条件、含别名
	 */
	public String delete(String hql, Map<String, Object> alias, Object[] values) {
		try {
			Query query = this.getQuery(hql);
			this.setParameter(query, values);
			this.setAliasParameter(query, alias);
			query.executeUpdate();
			return DELETESUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return DELETEFAILURE;
		}
	}

	public Iterator<?> getIterator(String hql) {
		return this.getQuery(hql).iterate();
	}

}
