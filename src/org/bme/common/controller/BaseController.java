package org.bme.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.bme.common.utils.Logger;
import org.bme.common.utils.PageData;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * 公共的Controller
 * 
 * @author 曦予
 * 
 */
public class BaseController {

	protected Logger logger = Logger.getLogger(this.getClass());

	/**
	 * 得到PageData
	 */
	public PageData getPageData() {
		return new PageData(this.getRequest());
	}

	/**
	 * 得到ModelAndView
	 */
	public ModelAndView getModelAndView() {
		return new ModelAndView();
	}

	/**
	 * 添加数据成功返回信息
	 * 
	 * @return
	 */
	public ModelMap getAddDataSuccessMM(Object obj) {
		return getReturnMsgMM(true, "数据添加成功！", obj);
	}

	/**
	 * 添加数据失败返回信息
	 * 
	 * @return
	 */
	public ModelMap getAddDataFailureMM() {
		return getReturnMsgMM(false, "数据添加失败！", null);
	}

	/**
	 * 更新数据成功返回信息
	 * 
	 * @return
	 */
	public ModelMap getUpdateDataSuccessMM(Object obj) {
		return getReturnMsgMM(true, "数据更新成功！", obj);
	}

	/**
	 * 更新数据失败返回信息
	 * 
	 * @return
	 */
	public ModelMap getUpdateDataFailureMM() {
		return getReturnMsgMM(false, "数据更新失败！", null);
	}

	/**
	 * 删除数据成功返回信息
	 * 
	 * @return
	 */
	public ModelMap getDeleteDataSuccessMM() {
		return getReturnMsgMM(true, "数据删除成功！", null);
	}

	/**
	 * 删除数据失败返回信息
	 * 
	 * @return
	 */
	public ModelMap getDeleteDataFailureMM() {
		return getReturnMsgMM(false, "数据删除失败！", null);
	}

	/**
	 * 返回信息（新增、更新、删除）
	 * 
	 * @param successMsg
	 *            true&false
	 * @param msg
	 *            返回的消息
	 * @return ModelMap 对象
	 */
	public ModelMap getReturnMsgMM(boolean successMsg, String msg, Object obj) {
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("success", successMsg);
		modelMap.addAttribute("msg", msg);
		modelMap.addAttribute("data", obj);
		return modelMap;
	}

	/**
	 * 得到request对象
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		return request;
	}

	public static void logBefore(Logger logger, String interfaceName) {
		logger.info("");
		logger.info("start");
		logger.info(interfaceName);
	}

	public static void logAfter(Logger logger) {
		logger.info("end");
		logger.info("");
	}

}
