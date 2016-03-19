package org.bme.basic.controller;

import org.bme.basic.model.DqxxbModel;
import org.bme.basic.model.ShfxxbModel;
import org.bme.basic.model.XfxxbModel;
import org.bme.basic.service.ProvinceInforService;
import org.bme.common.controller.BaseController;
import org.bme.common.entity.Dqxxb;
import org.bme.common.entity.Shfxxb;
import org.bme.common.entity.Xfxxb;
import org.bme.common.model.ConditionQueryModel;
import org.bme.common.model.PageModel;
import org.bme.common.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：ProvinceInforController   
 * 类描述：
 * 创建人：张俊   
 * 创建时间：2016年3月8日 下午5:33:30   
 * 修改人：张俊   
 * 修改时间：2016年3月8日 下午5:33:30   
 * 修改备注：   
 * @version 1.0  
 *
 */
@Controller
@RequestMapping("/provinceInfor")
public class ProvinceInforController<T> extends BaseController {
	@Autowired
	private ProvinceInforService<T> provinceInforService;
	
	/**
	 * 
	 * 方法名 ： provinceInfo
	 * 功能描述： 跳转到省份信息页面
	 * 输入参数：<按照参数定义顺序> 
	 * @param permission 布尔值对省份信息是否有新建和删除的权限
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelAndView类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 14, 2016 8:28:56 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 14, 2016 8:28:56 PM
	 *
	 */
	@RequestMapping("/list")
	public ModelAndView provinceInfo(boolean permission){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("basic/provinceInfor/html/provinceInfo");
		//modelAndView.addObject("permission", permission);
		modelAndView.addObject("permission", true);
		return modelAndView;
	}
	
	/**
	 * 
	 * 方法名 ： addShfxxb
	 * 功能描述： 新增省份信息
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelMap类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 14, 2016 8:30:43 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 14, 2016 8:30:43 PM
	 *
	 */
	@RequestMapping("/addShfxxb")
	@ResponseBody
	public ModelMap addShfxxb(ShfxxbModel shfxxbModel) {	
		Shfxxb shfxxb = new Shfxxb();
//		BeanCopier copier = BeanCopier.create(ShfxxbModel.class,Shfxxb.class,false);
//		copier.copy(shfxxbModel, shfxxb, null);
		//使用了别名手动拷贝
		shfxxb.setSfbh(shfxxbModel.getId());
		shfxxb.setSfmc(shfxxbModel.getName());
		shfxxb.setSfbz(shfxxbModel.getBz());
		shfxxb = provinceInforService.addShfxxb(shfxxb);
		if(!Util.isNull(shfxxb.getSfbh())){
			return getAddDataSuccessMM(shfxxb);
		}else{
			return getAddDataFailureMM();
		}
	}
	
	@RequestMapping("/updateShfxxb")
	@ResponseBody
	public ModelMap updateShfxxb(ShfxxbModel shfxxbModel){
		Shfxxb shfxxb = new Shfxxb();
//		BeanCopier copier = BeanCopier.create(ShfxxbModel.class,Shfxxb.class,false);
//		copier.copy(shfxxbModel, shfxxb, null);
		//使用了别名手动拷贝
		shfxxb.setSfbh(shfxxbModel.getId());
		shfxxb.setSfmc(shfxxbModel.getName());
		shfxxb.setSfbz(shfxxbModel.getBz());
		if(provinceInforService.updateShfxxb(shfxxb)){
			return getAddDataSuccessMM(shfxxb);
		}else{
			return getAddDataFailureMM();
		}
	}
	
	@RequestMapping("/deleteShfxxb")
	@ResponseBody
	public ModelMap deleteShfxxb(String primaryKeys){
		if (provinceInforService.deleteShfxxb(primaryKeys)) {
			return getDeleteDataSuccessMM();
		} else {
			return getDeleteDataFailureMM();
		}
	}
	
	@RequestMapping("/generalQueryShfxxb")
	@ResponseBody
	public ModelMap generalQueryShfxxb(ConditionQueryModel cqModel) {
		ModelMap modelMap = new ModelMap();
		PageModel<ShfxxbModel> pageModel;
		try {
			pageModel = provinceInforService
					.generalQueryShfxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	@RequestMapping("/exactQueryShfxxb")
	@ResponseBody
	public ModelMap exactQueryShfxxb(ConditionQueryModel cqModel){
		ModelMap modelMap = new ModelMap();
		PageModel<ShfxxbModel> pageModel;
		try {
			pageModel = provinceInforService
					.exactQueryShfxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	/**
	 * 
	 * 方法名 ： addDqxxb
	 * 功能描述： 之后都是地区相关控制器
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelMap类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 15, 2016 7:44:35 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 15, 2016 7:44:35 PM
	 *
	 */
	@RequestMapping("/addDqxxb")
	@ResponseBody
	public ModelMap addDqxxb(DqxxbModel dqxxbModel) {	
		Dqxxb dqxxb = new Dqxxb();
		Shfxxb shfxxb = new Shfxxb();
//		BeanCopier copier = BeanCopier.create(DqxxbModel.class,Dqxxb.class,false);
//		copier.copy(dqxxbModel, dqxxb, null);
		//使用了别名手动拷贝
		dqxxb.setDqbh(dqxxbModel.getId());
		dqxxb.setDqmc(dqxxbModel.getName());
		dqxxb.setDqbz(dqxxbModel.getBz());
		shfxxb.setSfbh(dqxxbModel.getSupId());
		dqxxb.setShfxxb(shfxxb);
		dqxxb = provinceInforService.addDqxxb(dqxxb);
		if(!Util.isNull(dqxxb.getDqbh())){
			return getAddDataSuccessMM(dqxxb);
		}else{
			return getAddDataFailureMM();
		}
	}
	
	@RequestMapping("/updateDqxxb")
	@ResponseBody
	public ModelMap updateDqxxb(DqxxbModel dqxxbModel){
		Dqxxb dqxxb = new Dqxxb();
		Shfxxb shfxxb = new Shfxxb();
//		BeanCopier copier = BeanCopier.create(DqxxbModel.class,Dqxxb.class,false);
//		copier.copy(dqxxbModel, dqxxb, null);
		//使用了别名手动拷贝
		dqxxb.setDqbh(dqxxbModel.getId());
		dqxxb.setDqmc(dqxxbModel.getName());
		dqxxb.setDqbz(dqxxbModel.getBz());
		shfxxb.setSfbh(dqxxbModel.getSupId());
		dqxxb.setShfxxb(shfxxb);
		if(provinceInforService.updateDqxxb(dqxxb)){
			return getAddDataSuccessMM(dqxxb);
		}else{
			return getAddDataFailureMM();
		}
	}
	
	@RequestMapping("/deleteDqxxb")
	@ResponseBody
	public ModelMap deleteDqxxb(String primaryKeys){
		if (provinceInforService.deleteDqxxb(primaryKeys)) {
			return getDeleteDataSuccessMM();
		} else {
			return getDeleteDataFailureMM();
		}
	}
	
	@RequestMapping("/cityQueryParent")
	@ResponseBody
	public ModelMap cityQueryParent(){
		ModelMap modelMap = new ModelMap();
		ConditionQueryModel cqModel = new ConditionQueryModel();
		PageModel<ShfxxbModel> pageModel;
		try {
			pageModel = provinceInforService
					.generalQueryShfxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return modelMap;
	}
	
	@RequestMapping("/generalQueryDqxxb")
	@ResponseBody
	public ModelMap generalQueryDqxxb(ConditionQueryModel cqModel) {
		ModelMap modelMap = new ModelMap();
		PageModel<DqxxbModel> pageModel;
		try {
			pageModel = provinceInforService
					.generalQueryDqxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	@RequestMapping("/exactQueryDqxxb")
	@ResponseBody
	public ModelMap exactQueryDqxxb(ConditionQueryModel cqModel){
		ModelMap modelMap = new ModelMap();
		PageModel<DqxxbModel> pageModel;
		try {
			pageModel = provinceInforService
					.exactQueryDqxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	/**
	 * 
	 * 方法名 ： addXfxxb
	 * 功能描述： 添加县份信息
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelMap类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 16, 2016 10:59:26 AM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 16, 2016 10:59:26 AM
	 *
	 */
	@RequestMapping("/addXfxxb")
	@ResponseBody
	public ModelMap addXfxxb(XfxxbModel xfxxbModel) {	
		Xfxxb xfxxb = new Xfxxb();
		Dqxxb dqxxb = new Dqxxb();
//		BeanCopier copier = BeanCopier.create(XfxxbModel.class,Xfxxb.class,false);
//		copier.copy(xfxxbModel, xfxxb, null);
		//使用了别名手动拷贝
		xfxxb.setXfbh(xfxxbModel.getId());
		xfxxb.setXfmc(xfxxbModel.getName());
		xfxxb.setXfbz(xfxxbModel.getBz());
		dqxxb.setDqbh(xfxxbModel.getSupId());
		xfxxb.setDqxxb(dqxxb);
		xfxxb = provinceInforService.addXfxxb(xfxxb);
		if(!Util.isNull(xfxxb.getXfbh())){
			return getAddDataSuccessMM(xfxxb);
		}else{
			return getAddDataFailureMM();
		}
	}
	
	@RequestMapping("/updateXfxxb")
	@ResponseBody
	public ModelMap updateXfxxb(XfxxbModel xfxxbModel){
		Xfxxb xfxxb = new Xfxxb();
		Dqxxb dqxxb = new Dqxxb();
//		BeanCopier copier = BeanCopier.create(XfxxbModel.class,Xfxxb.class,false);
//		copier.copy(xfxxbModel, xfxxb, null);
		//使用了别名手动拷贝
		xfxxb.setXfbh(xfxxbModel.getId());
		xfxxb.setXfmc(xfxxbModel.getName());
		xfxxb.setXfbz(xfxxbModel.getBz());
		dqxxb.setDqbh(xfxxbModel.getSupId());
		xfxxb.setDqxxb(dqxxb);
		if(provinceInforService.updateXfxxb(xfxxb)){
			return getAddDataSuccessMM(xfxxb);
		}else{
			return getAddDataFailureMM();
		}
	}
	
	@RequestMapping("/deleteXfxxb")
	@ResponseBody
	public ModelMap deleteXfxxb(String primaryKeys){
		if (provinceInforService.deleteXfxxb(primaryKeys)) {
			return getDeleteDataSuccessMM();
		} else {
			return getDeleteDataFailureMM();
		}
	}
	
	@RequestMapping("/townQueryParent")
	@ResponseBody
	public ModelMap townQueryParent(){
		ModelMap modelMap = new ModelMap();
		ConditionQueryModel cqModel = new ConditionQueryModel();
		PageModel<DqxxbModel> pageModel;
		try {
			pageModel = provinceInforService
					.generalQueryDqxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return modelMap;
	}
	
	@RequestMapping("/generalQueryXfxxb")
	@ResponseBody
	public ModelMap generalQueryXfxxb(ConditionQueryModel cqModel) {
		ModelMap modelMap = new ModelMap();
		PageModel<XfxxbModel> pageModel;
		try {
			pageModel = provinceInforService
					.generalQueryXfxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	@RequestMapping("/exactQueryXfxxb")
	@ResponseBody
	public ModelMap exactQueryXfxxb(ConditionQueryModel cqModel){
		ModelMap modelMap = new ModelMap();
		PageModel<XfxxbModel> pageModel;
		try {
			pageModel = provinceInforService
					.exactQueryXfxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
}
