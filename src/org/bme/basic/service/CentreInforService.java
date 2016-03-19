package org.bme.basic.service;

import java.util.List;

import org.bme.basic.model.ZxxxbModel;
import org.bme.common.entity.Gwxxb;
import org.bme.common.entity.Yhgwglxxb;
import org.bme.common.entity.Yhxxb;
import org.bme.common.entity.Zxxxb;
import org.bme.common.model.ConditionQueryModel;
import org.bme.common.model.PageModel;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：CentreInforService   
 * 类描述：中心信息维护的service
 * 创建人：张俊   
 * 创建时间：2016年3月10日 下午9:02:01   
 * 修改人：张俊   
 * 修改时间：2016年3月10日 下午9:02:01   
 * 修改备注：   
 * @version 1.0  
 *
 */
public interface CentreInforService<T> {

	/**
	 * 
	 * 方法名 ： addZxxxb
	 * 功能描述： 添加中心信息表
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：Zxxxb类型的数据
	 * 异常：无
	 * 创建人：张俊   
	 * 创建时间：2016年3月10日 下午9:01:55   
	 * 修改人：张俊   
	 * 修改时间：2016年3月10日 下午9:01:55
	 *
	 */
	Zxxxb addZxxxb(Zxxxb zxxxb);
	
	/**
	 * 
	 * 方法名 ： addYhxxb
	 * 功能描述： 添加中心管理员
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：Yhxxb类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 13, 2016 10:15:48 AM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 13, 2016 10:15:48 AM
	 *
	 */
	Yhxxb addYhxxb(Yhxxb yhxxb);

	/**
	 * 
	 * 方法名 ： updateZxxxb
	 * 功能描述： 修改中心信息
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：boolean类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 13, 2016 10:16:05 AM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 13, 2016 10:16:05 AM
	 *
	 */
	boolean updateZxxxb(Zxxxb zxxxb);
	
	/**
	 * 
	 * 方法名 ： updataYhxxb
	 * 功能描述： 修改中心管理员信息
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：boolean类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 13, 2016 10:16:29 AM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 13, 2016 10:16:29 AM
	 *
	 */
	boolean updataYhxxb(Yhxxb yhxxb);

	/**
	 * 
	 * 方法名 ： deleteZxxxb
	 * 功能描述： 删除中心
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：boolean类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 13, 2016 10:16:42 AM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 13, 2016 10:16:42 AM
	 *
	 */
	boolean deleteZxxxb(String primaryKeys);

	/**
	 * 
	 * 方法名 ： generalQueryZxxxb
	 * 功能描述： 普通查询
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：PageModel<Zxxxb>类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 13, 2016 10:16:58 AM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 13, 2016 10:16:58 AM
	 *
	 */
	PageModel<ZxxxbModel> generalQueryZxxxb(ConditionQueryModel cqModel) throws Exception;

	/**
	 * 
	 * 方法名 ： exactQueryZxxxb
	 * 功能描述： 精确查询
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：PageModel<Zxxxb>类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 13, 2016 10:17:17 AM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 13, 2016 10:17:17 AM
	 *
	 */
	PageModel<ZxxxbModel> exactQueryZxxxb(ConditionQueryModel cqModel) throws Exception;

	/**
	 * 
	 * 方法名 ： getGwxxb
	 * 功能描述： 通过岗位名称获取岗位编号，用来关联中心管理员岗位
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：Gwxxb类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 13, 2016 11:21:58 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 13, 2016 11:21:58 PM
	 *
	 */
	Gwxxb getGwxxb(String string) throws Exception;

	/**
	 * 
	 * 方法名 ： addYhgwglxxb
	 * 功能描述： 增加用户岗位关联信息，关联中心管理员岗位
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：Yhgwglxxb类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 13, 2016 11:22:48 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 13, 2016 11:22:48 PM
	 *
	 */
	Yhgwglxxb addYhgwglxxb(Yhgwglxxb yhgwglxxb);

	/**
	 * 
	 * 方法名 ： getYhxxbByZxbhAndGwmc
	 * 功能描述： 通过中心编号和岗位名称获取相关用户信息
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：PageModel<YhxxbModel>类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 14, 2016 3:15:14 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 14, 2016 3:15:14 PM
	 *
	 */
	List<Yhxxb> getYhxxbByZxbhAndGwmc(String zxbh, String gwmc);

	List<Yhgwglxxb> getYhgwglxxb(String gwhb) throws Exception;

	
}
