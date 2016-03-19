package org.bme.basic.controller;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.bme.basic.model.CentreFormModel;
import org.bme.basic.model.ReturnModel;
import org.bme.basic.model.ZxxxbModel;
import org.bme.basic.service.CentreInforService;
import org.bme.common.controller.BaseController;
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
@RequestMapping("/centreInfor")
public class CentreInforController<T> extends BaseController  {
	
	/**
	 * CentreInforService接口
	 */
	@Autowired
	private CentreInforService<T> service;
	
	/**
	 * 
	 * 方法名 ： centreInfo
	 * 功能描述： 跳转到中心信息管理
	 * 输入参数：<按照参数定义顺序> 
	 * @param permission 布尔值对中心信息是否有删改的权利
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelAndView类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 17, 2016 9:09:31 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 17, 2016 9:09:31 PM
	 *
	 */
	@RequestMapping("/list")
	public ModelAndView centreInfo(boolean permission){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("basic/centreInfor/html/centerInfo");
		//modelAndView.addObject("permission", permission);
		modelAndView.addObject("permission", true);
		return modelAndView;
	}
	
	/** 新增：中心信息表
	 * 
	 * @return
	 */
	@RequestMapping("/addZxxxb")
	@ResponseBody
	public ModelMap addZxxxb(CentreFormModel formModel, @RequestParam String csrq, @RequestParam String gwmc) {
		ZxxxbModel zxxxbModel = formModel.getZxxxbModel();
		YhxxbModel yhxxbModel = formModel.getYhxxbModel();
		if(!csrq.equals(""))
			yhxxbModel.setCsrq(Timestamp.valueOf(csrq+" 00:00:00"));
	
		Zxxxb zxxxb = new Zxxxb();
		Yhxxb yhxxb = new Yhxxb();
		/* 实体属性复制，将sysMkxxbModel中的属性值复制到SysMkxxb中
		 * BeanUtils.copyProperties(sysMkxxbModel, sysMkxxb);
		 * 
		 * 以下两行代码和上面这行功能一致，在效率方面：下面的比上面的好。
		 * 测试的数据为1百万次，结果为：BeanCopier.create耗时9毫秒；
		 * 							 BeanUtils.copyProperties耗时382毫秒
		 */
		BeanCopier zxxxbCopier = BeanCopier.create(ZxxxbModel.class,Zxxxb.class,false);
		zxxxbCopier.copy(zxxxbModel, zxxxb, null);
		BeanCopier yhxxbCopier = BeanCopier.create(YhxxbModel.class, Yhxxb.class, false);
		yhxxbCopier.copy(yhxxbModel, yhxxb, null);
		zxxxb = service.addZxxxb(zxxxb);
		if(!Util.isNull(zxxxb.getZxbh())){
			//中心为1，单位为2.机构类别
			yhxxb.setSsjglb(new BigDecimal(1));
			yhxxb.setSsjgbh(zxxxb.getZxbh());
			yhxxb = service.addYhxxb(yhxxb);
			try {
				Gwxxb gwxxb = service.getGwxxb(gwmc);
				Yhgwglxxb yhgwglxxb = new Yhgwglxxb(yhxxb,gwxxb);
				service.addYhgwglxxb(yhgwglxxb);
				if(!Util.isNull(yhgwglxxb.getYhgwglbh())){
					ReturnModel returnModel = new ReturnModel(zxxxb.getZxmc(), yhxxb.getXm());
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
	
	/**更新：中心信息表
	 * 
	 * @return
	 */
	@RequestMapping("/updateZxxxb")
	@ResponseBody
	public ModelMap updateZxxxb(CentreFormModel formModel, @RequestParam String csrq, @RequestParam String gwmc) {
		ZxxxbModel zxxxbModel = formModel.getZxxxbModel();
		YhxxbModel yhxxbModel = formModel.getYhxxbModel();
		if(!csrq.equals(""))
			yhxxbModel.setCsrq(Timestamp.valueOf(csrq+" 00:00:00"));
		
		Zxxxb zxxxb = new Zxxxb();
		Yhxxb yhxxb = new Yhxxb();
		/* 实体属性复制，将sysMkxxbModel中的属性值复制到SysMkxxb中
		 * BeanUtils.copyProperties(sysMkxxbModel, sysMkxxb);
		 * 
		 * 以下两行代码和上面这行功能一致，在效率方面：下面的比上面的好。
		 * 测试的数据为1百万次，结果为：BeanCopier.create耗时9毫秒；
		 * 							 BeanUtils.copyProperties耗时382毫秒
		 */
		BeanCopier zxxxbCopier = BeanCopier.create(ZxxxbModel.class,Zxxxb.class,false);
		zxxxbCopier.copy(zxxxbModel, zxxxb, null);
		BeanCopier yhxxbCopier = BeanCopier.create(YhxxbModel.class,Yhxxb.class,false);
		yhxxbCopier.copy(yhxxbModel, yhxxb, null);
		//中心为1，单位为2.机构类别
		yhxxb.setSsjglb(new BigDecimal(1));
		yhxxb.setSsjgbh(zxxxb.getZxbh());
		if(service.updateZxxxb(zxxxb) && service.updataYhxxb(yhxxb)){
			ReturnModel returnModel = new ReturnModel(zxxxb.getZxmc(), yhxxb.getXm());
			return getUpdateDataSuccessMM(returnModel);
		}else{
			return getUpdateDataFailureMM();
		}
	}
	
	/** 删除：中心信息表
	 * 
	 * @return
	 */
	@RequestMapping("/deleteZxxxb")
	@ResponseBody
	public ModelMap deleteZxxxb(String primaryKeys) {
		if (service.deleteZxxxb(primaryKeys)) {
			return getDeleteDataSuccessMM();
		} else {
			return getDeleteDataFailureMM();
		}
	}

	/** 查询（普通）：中心信息表
	 * 
	 * @param cqModel
	 * @return
	 */
	@RequestMapping("/generalQueryZxxxb")
	@ResponseBody
	public ModelMap generalQueryZxxxb(ConditionQueryModel cqModel) {
		ModelMap modelMap = new ModelMap();
		PageModel<ZxxxbModel> pageModel;
		PageModel<ZxxxbModel> topCenterModel;
		try {
			pageModel = service
						.generalQueryZxxxb(cqModel);
			cqModel.setParamPairs("{'zxjb':1}");
			cqModel.setOffset(0);
			cqModel.setLimit(0);
			topCenterModel = service
					.exactQueryZxxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			//获取上级中心名称，并存入ZxxxbModel
			List<ZxxxbModel> zxxxbs = pageModel.getDatas();
			List<ZxxxbModel> topCenters = topCenterModel.getDatas();
			
			for (int i = 0; i < zxxxbs.size(); i++) {
				if (zxxxbs.get(i).getSjzxbh() != null) {
					for (ZxxxbModel zxxxb : topCenters) {
						if (zxxxb.getZxbh().equals(zxxxbs.get(i).getSjzxbh())) {
							zxxxbs.get(i).setSjzxmc(zxxxb.getZxmc());
							break;
						}
					}
				}
			}
			
			modelMap.addAttribute("data", zxxxbs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	/** 查询（精确）：中心信息表
	 * 
	 * @param cqModel
	 * @return
	 */
	@RequestMapping("/exactQueryZxxxb")
	@ResponseBody
	public ModelMap exactQueryZxxxb(ConditionQueryModel cqModel) {
		ModelMap modelMap = new ModelMap();
		try {
			PageModel<ZxxxbModel> pageModel = service
					.exactQueryZxxxb(cqModel);
			cqModel.setParamPairs("{'zxjb':1}");
			PageModel<ZxxxbModel> topCenterModel = service
					.exactQueryZxxxb(cqModel);
			modelMap.addAttribute("limit", pageModel.getLimit());
			modelMap.addAttribute("offset", pageModel.getOffset());
			modelMap.addAttribute("length", pageModel.getTotal());
			List<ZxxxbModel> zxxxbs = pageModel.getDatas();
			List<ZxxxbModel> topCenters = topCenterModel.getDatas();
			
			for (int i = 0; i < zxxxbs.size(); i++) {
				if (zxxxbs.get(i).getSjzxbh() != null) {
					for (ZxxxbModel zxxxb : topCenters) {
						if (zxxxb.getZxbh().equals(zxxxbs.get(i).getSjzxbh())) {
							zxxxbs.get(i).setSjzxmc(zxxxb.getZxmc());
							break;
						}
					}
				}
			}
			
			modelMap.addAttribute("data", zxxxbs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}

	/**
	 * 
	 * 方法名 ： queryParent
	 * 功能描述： 获取一级中心名称，用于新建或修改的select下拉框
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelMap类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 14, 2016 3:09:49 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 14, 2016 3:09:49 PM
	 *
	 */
	@RequestMapping("/queryParent")
	@ResponseBody
	public ModelMap queryParent(ConditionQueryModel cqModel){
		ModelMap modelMap = new ModelMap();
		cqModel.setParamPairs("{'zxjb':1}");
		try {
			PageModel<ZxxxbModel> pageModel = service
					.exactQueryZxxxb(cqModel);
			modelMap.addAttribute("rows", pageModel.getDatas());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	/**
	 * 
	 * 方法名 ： queryManager
	 * 功能描述： 通过中心编号获取其管理员信息，方便用户修改。
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：ModelMap类型的数据
	 * 异常：无
	 * 创建人：朱俊杰   
	 * 创建时间：Mar 14, 2016 3:11:11 PM   
	 * 修改人：朱俊杰   
	 * 修改时间：Mar 14, 2016 3:11:11 PM
	 *
	 */
	@RequestMapping("/queryManager")
	@ResponseBody
	public ModelMap queryManager(@RequestParam String zxbh, @RequestParam String gwmc){
		ModelMap modelMap = new ModelMap();
		List<Yhxxb> yhxxb = service
				.getYhxxbByZxbhAndGwmc(zxbh,gwmc);
		modelMap.addAttribute("data", yhxxb);
		return modelMap;
	}
	
}
