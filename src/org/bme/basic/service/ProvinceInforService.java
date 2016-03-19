package org.bme.basic.service;

import org.bme.basic.model.DqxxbModel;
import org.bme.basic.model.ShfxxbModel;
import org.bme.basic.model.XfxxbModel;
import org.bme.common.entity.Dqxxb;
import org.bme.common.entity.Shfxxb;
import org.bme.common.entity.Xfxxb;
import org.bme.common.model.ConditionQueryModel;
import org.bme.common.model.PageModel;

public interface ProvinceInforService<T> {

	/**
	 * 
	 * 方法名 ： addShfxxb
	 * 功能描述： 
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 *     @param shfxxb 学院信息表
	 * 返回值：Shfxxb类型的数据
	 * 异常：无
	 * 创建人：张俊   
	 * 创建时间：2016年3月8日 下午3:24:58   
	 * 修改人：张俊   
	 * 修改时间：2016年3月8日 下午3:24:58
	 *
	 */
	public Shfxxb addShfxxb(Shfxxb shfxxb);

	boolean updateShfxxb(Shfxxb shfxxb);

	boolean deleteShfxxb(String primaryKeys);

	Dqxxb addDqxxb(Dqxxb dqxxb);

	boolean updateDqxxb(Dqxxb dqxxb);

	boolean deleteDqxxb(String primaryKeys);

	Xfxxb addXfxxb(Xfxxb xfxxb);

	boolean updateXfxxb(Xfxxb xfxxb);

	boolean deleteXfxxb(String primaryKeys);

	PageModel<ShfxxbModel> generalQueryShfxxb(ConditionQueryModel cqModel) throws Exception;

	PageModel<ShfxxbModel> exactQueryShfxxb(ConditionQueryModel cqModel) throws Exception;

	PageModel<DqxxbModel> generalQueryDqxxb(ConditionQueryModel cqModel)throws Exception;
	
	PageModel<DqxxbModel> exactQueryDqxxb(ConditionQueryModel cqModel)throws Exception;

	PageModel<XfxxbModel> generalQueryXfxxb(ConditionQueryModel cqModel)throws Exception;
	
	PageModel<XfxxbModel> exactQueryXfxxb(ConditionQueryModel cqModel)throws Exception;
	
}
