package org.bme.basic.controller;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.bme.basic.model.DwxxbModel;
import org.bme.basic.model.OrganizationFormModel;
import org.bme.basic.model.ReturnModel;
import org.bme.basic.model.ZxxxbModel;
import org.bme.basic.service.CentreInforService;
import org.bme.basic.service.OrganizationInforService;
import org.bme.common.controller.BaseController;
import org.bme.common.entity.Dwxxb;
import org.bme.common.entity.Gwxxb;
import org.bme.common.entity.Yhgwglxxb;
import org.bme.common.entity.Yhxxb;
import org.bme.common.entity.Zxxxb;
import org.bme.common.model.ConditionQueryModel;
import org.bme.common.model.PageModel;
import org.bme.common.utils.Util;
import org.bme.system.model.YhxxbModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/organizationInfor")
public class OrganizationInforController <T> extends BaseController{

	/**
	 * OrganizationInforService接口
	 */
	@Autowired
	private OrganizationInforService<T> service;
	@Autowired
	private CentreInforService<T> centreService;
	
	/**
	 * 
	 * 方法名 ： centreInfo
	 * 功能描述： 跳转到单位信息维护
	 * 输入参数：<按照参数定义顺序> 
	 * @param permission 布尔值判断是否有删改单位信心的权限
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelAndView类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 17, 2016 9:11:29 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 17, 2016 9:11:29 PM
	 *
	 */
	@RequestMapping("/list")
	public ModelAndView centreInfo(boolean permission){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("basic/organizationInfor/html/organizationInfo");
		//modelAndView.addObject("permission", permission);
		modelAndView.addObject("permission", true);
		return modelAndView;
	}
	
	/** 新增：单位信息表
	 * 
	 * @return
	 */
	@RequestMapping("/addDwxxb")
	@ResponseBody
	public ModelMap addDwxxb(OrganizationFormModel formModel, @RequestParam String csrq, @RequestParam String gwmc) {
		DwxxbModel dwxxbModel = formModel.getDwxxbModel();
		YhxxbModel yhxxbModel = formModel.getYhxxbModel();
		if(!csrq.equals(""))
			yhxxbModel.setCsrq(Timestamp.valueOf(csrq+" 00:00:00"));
	
		Dwxxb dwxxb = new Dwxxb();
		Yhxxb yhxxb = new Yhxxb();
		Zxxxb zxxxb = new Zxxxb();
		BeanCopier dwxxbCopier = BeanCopier.create(DwxxbModel.class,Dwxxb.class,false);
		dwxxbCopier.copy(dwxxbModel, dwxxb, null);
		zxxxb.setZxbh(dwxxbModel.getSszxbh());
		dwxxb.setZxxxb(zxxxb);
		BeanCopier yhxxbCopier = BeanCopier.create(YhxxbModel.class, Yhxxb.class, false);
		yhxxbCopier.copy(yhxxbModel, yhxxb, null);
		dwxxb = service.addDwxxb(dwxxb);
		if(!Util.isNull(dwxxb.getDwbh())){
			//中心为1，单位为2.机构类别
			yhxxb.setSsjglb(new BigDecimal(2));
			yhxxb.setSsjgbh(dwxxb.getDwbh());
			yhxxb = service.addYhxxb(yhxxb);
			try {
				Gwxxb gwxxb = service.getGwxxb(gwmc);
				Yhgwglxxb yhgwglxxb = new Yhgwglxxb(yhxxb,gwxxb);
				service.addYhgwglxxb(yhgwglxxb);
				if(!Util.isNull(yhgwglxxb.getYhgwglbh())){
					ReturnModel returnModel = new ReturnModel(dwxxb.getDwmc(), yhxxb.getXm());
					return getAddDataSuccessMM(returnModel);
				}else {
					return getAddDataFailureMM();
				}
			} catch (Exception e) {
				e.printStackTrace();
				return getAddDataFailureMM();
			}
		}else{
			return getAddDataFailureMM();
		}
	}
	
	/**更新：单位信息表
	 * 
	 * @return
	 */
	@RequestMapping("/updateDwxxb")
	@ResponseBody
	public ModelMap updateZxxxb(OrganizationFormModel formModel, @RequestParam String csrq, @RequestParam String gwmc) {
		DwxxbModel dwxxbModel = formModel.getDwxxbModel();
		YhxxbModel yhxxbModel = formModel.getYhxxbModel();
		if(!csrq.equals(""))
			yhxxbModel.setCsrq(Timestamp.valueOf(csrq+" 00:00:00"));
		
		Dwxxb dwxxb = new Dwxxb();
		Yhxxb yhxxb = new Yhxxb();
		Zxxxb zxxxb = new Zxxxb();
		
		BeanCopier zxxxbCopier = BeanCopier.create(DwxxbModel.class, Dwxxb.class, false);
		zxxxbCopier.copy(dwxxbModel, dwxxb, null);
		BeanCopier yhxxbCopier = BeanCopier.create(YhxxbModel.class,Yhxxb.class,false);
		yhxxbCopier.copy(yhxxbModel, yhxxb, null);
		zxxxb.setZxbh(dwxxbModel.getSszxbh());
		dwxxb.setZxxxb(zxxxb);
		//中心为1，单位为2.机构类别
		yhxxb.setSsjglb(new BigDecimal(2));
		yhxxb.setSsjgbh(dwxxb.getDwbh());
		if(service.updateDwxxb(dwxxb) && service.updataYhxxb(yhxxb)){
			ReturnModel returnModel = new ReturnModel(dwxxb.getDwmc(), yhxxb.getXm());
			return getUpdateDataSuccessMM(returnModel);
		}else{
			return getUpdateDataFailureMM();
		}
	}
	
	/** 删除：单位信息表
	 * 
	 * @return
	 */
	@RequestMapping("/deleteDwxxb")
	@ResponseBody
	public ModelMap deleteDwxxb(String primaryKeys) {
		if (service.deleteDwxxb(primaryKeys)) {
			return getDeleteDataSuccessMM();
		} else {
			return getDeleteDataFailureMM();
		}
	}
	
	/** 查询（普通）：单位信息表
	 * 
	 * @param cqModel
	 * @return
	 */
	@RequestMapping("/generalQueryDwxxb")
	@ResponseBody
	public ModelMap generalQueryDwxxb(ConditionQueryModel cqModel) {
		ModelMap modelMap = new ModelMap();
		
		PageModel<DwxxbModel> pageModel;
		try {
			pageModel = service
						.generalQueryDwxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());			
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	/** 查询（精确）：单位信息表
	 * 
	 * @param cqModel
	 * @return
	 */
	@RequestMapping("/exactQueryDwxxb")
	@ResponseBody
	public ModelMap exactQueryDwxxb(ConditionQueryModel cqModel) {
		ModelMap modelMap = new ModelMap();
		try {
			PageModel<DwxxbModel> pageModel = service
					.exactQueryDwxxb(cqModel);
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
	 * 方法名 ： queryParent
	 * 功能描述： 获取中心名称，用于新建或修改的select下拉框
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelMap类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 16, 2016 9:50:25 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 16, 2016 9:50:25 PM
	 *
	 */
	@RequestMapping("/queryParent")
	@ResponseBody
	public ModelMap queryParent(ConditionQueryModel cqModel){
		ModelMap modelMap = new ModelMap();
		try {
			PageModel<ZxxxbModel> pageModel = centreService
					.generalQueryZxxxb(cqModel);
			modelMap.addAttribute("data", pageModel.getDatas());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	/**
	 * 
	 * 方法名 ： queryManager
	 * 功能描述： 
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelMap类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 17, 2016 9:42:14 AM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 17, 2016 9:42:14 AM
	 *
	 */
	@RequestMapping("/queryManager")
	@ResponseBody
	public ModelMap queryManager(@RequestParam String dwbh, @RequestParam String gwmc){
		ModelMap modelMap = new ModelMap();
		List<Yhxxb> yhxxb = service
				.getYhxxbByDwbhAndGwmc(dwbh,gwmc);
		modelMap.addAttribute("data", yhxxb);
		return modelMap;
	}
}
