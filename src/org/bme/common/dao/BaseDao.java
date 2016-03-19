package org.bme.common.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bme.common.model.PageModel;

public interface BaseDao<T> {

	/**
	 * 查询，不带分页
	 * 
	 * @param <T>
	 */
	List<T> getList(String hql);

	List<T> getList(String hql, Object[] values);// select u from User u where
	
	List<T> getSQLList(String sql);

	List<T> getSQLList(String sql, String string, List<String> fieldList);

//	/**
//	 * 查询，带分页的
//	 */
//	PageModel<T> getPageModel(String hql, Object[] values, int page, int limit);
//
//	PageModel<T> getPageModel(String hql, int page, int limit);
//
//	PageModel<T> getSQLPageModel(String sql, int page, int limit,
//			String Path, List<String> fieldList);
	/**
	 * 分页列表对象
	 * 
	 * @param hql
	 *            查询对象的hql
	 * @param args
	 *            查询参数
	 * @return 一组不分页的列表对象
	 */
	PageModel<T> getPageModel(String hql, Object[] args);

	PageModel<T> getPageModel(String hql, Object arg);

	PageModel<T> getPageModel(String hql);
	
	
	/**
	 * 别名查询 1、select u from User u where u.username=:uid and u.password=:p key
	 * val uid admin p admin 2、select u from User u where u.id in(:ids) key:ids
	 * value:Object->List<Object>->> 1 2 3 4
	 * 
	 * select u from User u where u.id in(1,2,3,4)
	 */
	List<T> getList(String hql, Map<String, Object> alias);

	List<T> getList(String hql, Object[] values, Map<String, Object> alias);

	PageModel<T> getPageModelByAlias(String hql, Map<String, Object> alias);
	
	PageModel<T> getPageModel(String hql, Object[] args,
			Map<String, Object> alias);

//	PageModel<T> getPageModel(String hql, Map<String, Object> alias, int page,
//			int limit);
//
//	PageModel<T> getPageModel(String hql, Object[] values,
//			Map<String, Object> alias, int page, int limit);

	/**
	 * 查单个
	 */
	T getObject(String hql);

	T getObject(Class<T> clazz, int id);

	T getObject(String hql, Object[] values);

	/**
	 * 添加对象
	 * 
	 * @param t
	 * @return
	 */
	T add(T t);
	
	boolean addImport(Object t);

	boolean addRB(Object t);

	/**
	 * 修改
	 */
	boolean update(Object t);
	
	boolean updateImport(String hql);
	
	boolean updateRB(Object t);
	
	boolean updateImport(Object t);

	String update(String hql);
	
	boolean updateRB(String hql);

	String update(String hql, Object[] values);

	String update(String hql, Map<String, Object> alias);

	String update(String hql, Map<String, Object> alias, Object[] values);

	/**
	 * 删除
	 */
	String delete(Object t);
	
	String deleteImport(Object t);

	String delete(String hql);
	
	boolean deleteImport(String hql) ;

	boolean deleteRB(String hql);

	String delete(String hql, Object[] values);

	boolean delete(String hql, Map<String, Object> alias);

	String delete(String hql, Map<String, Object> alias, Object[] values);

	Iterator<?> getIterator(String hql);

}
