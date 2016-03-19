package org.bme.basic.service;

import java.util.List;

import org.bme.basic.model.DwxxbModel;
import org.bme.common.entity.Dwxxb;
import org.bme.common.entity.Gwxxb;
import org.bme.common.entity.Yhgwglxxb;
import org.bme.common.entity.Yhxxb;
import org.bme.common.model.ConditionQueryModel;
import org.bme.common.model.PageModel;

public interface OrganizationInforService<T> {

	/**
	 * 
	 * 方法名 ： addDwxxb
	 * 功能描述： 添加新单位
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：Dwxxb类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 15, 2016 3:21:46 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 15, 2016 3:21:46 PM
	 *
	 */
	Dwxxb addDwxxb(Dwxxb dwxxb);
	
	/**
	 * 
	 * 方法名 ： updateDwxxb
	 * 功能描述： 更新单位信息
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：boolean类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 15, 2016 3:24:37 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 15, 2016 3:24:37 PM
	 *
	 */
	boolean updateDwxxb(Dwxxb dwxxb);
	
	/**
	 * 
	 * 方法名 ： deleteDwxxb
	 * 功能描述： 删除单位信息
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：boolean类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 15, 2016 3:25:36 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 15, 2016 3:25:36 PM
	 *
	 */
	boolean deleteDwxxb(String primaryKeys);
	
	/**
	 * 
	 * 方法名 ： generalQueryDwxxb
	 * 功能描述： 普通查询
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：PageModel<DwxxbModel>类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 15, 2016 3:27:32 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 15, 2016 3:27:32 PM
	 *
	 */
	PageModel<DwxxbModel> generalQueryDwxxb(ConditionQueryModel cqModel) throws Exception;

	/**
	 * 
	 * 方法名 ： exactQueryDwxxb
	 * 功能描述： 精确查询
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：PageModel<DwxxbModel>类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 15, 2016 3:30:33 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 15, 2016 3:30:33 PM
	 *
	 */
	PageModel<DwxxbModel> exactQueryDwxxb(ConditionQueryModel cqModel) throws Exception;

	Yhxxb addYhxxb(Yhxxb yhxxb);

	boolean updataYhxxb(Yhxxb yhxxb);

	Gwxxb getGwxxb(String string) throws Exception;

	Yhgwglxxb addYhgwglxxb(Yhgwglxxb yhgwglxxb);

	List<Yhxxb> getYhxxbByDwbhAndGwmc(String dwbh, String gwmc);
}
