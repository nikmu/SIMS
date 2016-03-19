package org.bme.common.utils.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 项目名称：TEMS（教学评价管理系统）   
 * 类名称：FieldMeta_QueryHQL   
 * 类描述：定义一个注解 @FieldMeta_QueryHQL
 * 创建人：张俊   
 * 创建时间：2016年2月5日 下午6:19:04   
 * 修改人：张俊   
 * 修改时间：2016年2月5日 下午6:19:04   
 * 修改备注：   
 * @version 1.0  
 *
 */
// 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Retention(RetentionPolicy.RUNTIME)
// 表示注解可以被使用于字段、枚举的常量和方法上
@Target({ ElementType.FIELD, ElementType.METHOD })
// 说明该注解将被包含在javadoc中
@Documented
public @interface FieldMeta_QueryHQL {
	/** 是否为辅助字段
	 * 
	 * @return
	 */
	boolean subsidiary() default false;

	/** 字段别名（主要是用来对主外键关联时类的嵌套所使用）
	 * 
	 * eg：在Zgxxb中不存在bmbh这个字段，但是存在Bmxxb这个类，
	 * 这时就需要通过bmxxb.bmbh才能获去到bmbh，所以在自动封装HQL查询语句时就可以将bmxxb.bmbh提前写在alias()中
	 * 
	 * @return
	 */
	String alias() default "";

	/** 字段描述
	 * 
	 * @return
	 */
	String description() default "";

	/** 排序字段
	 * 
	 * @return
	 */
	int order() default 0;
}
