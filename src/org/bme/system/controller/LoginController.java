package org.bme.system.controller;

import org.bme.common.controller.BaseController;
import org.bme.system.model.YhxxbModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController<T> extends BaseController {
	
	
	@RequestMapping("/login")
	public String login(YhxxbModel yhxxbModel) {
		System.out.println(yhxxbModel);
//		if (null == jcYhxxbModel.getMm() || "".equals(jcYhxxbModel.getMm())) {
//			model.addAttribute("errorClass", "alert-info");
//			model.addAttribute("errorInfo", "请输入密码!");
//			return "login";
//		}
//		jcYhxxbModel.setMm(Util.encryptMD5(jcYhxxbModel.getMm()));
//		JcYhxxb jcYhxxb = loginService.login(jcYhxxbModel);
//		if (jcYhxxb == null) {
//			model.addAttribute("errorClass", "alert-danger");
//			model.addAttribute("errorInfo", "用户名或密码错误!");
//			return "login";
//		}
//
//		Constants.LOGIN_USER = jcYhxxb.getYhm();
//		Constants.LOGIN_USER = "admin";
		return "redirect:/login/loadIndex";
	}
	
	@RequestMapping("/loadIndex")
	public ModelAndView loadIndex(){
		ModelAndView modelAndView = new ModelAndView("index/index");
		//modelAndView.addObject("loadMenu", "/asserts/html/sidebar.jsp");
		return modelAndView; 
	}
}
