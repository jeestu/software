package edu.zut.cs.software.moon.base.web.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 未捕获异常的处理，需要在web.xml中配�?<error-page>
 *
 * @author <a href="mailto:545314690@qq.om">lisenmiao</a>
 * @date 2014�?7�?31日下�?6:03:01
 */
@Controller
@RequestMapping("/error")
public class HandleError {

	@RequestMapping(value = "400", method = RequestMethod.GET)
	public ModelAndView error_400(ModelMap modelMap) {
		modelMap.put("errorMessage", "400&nbsp;&nbsp;出错�?!");
		return new ModelAndView("commons/error", modelMap);
	}

	@RequestMapping(value = "404", method = RequestMethod.GET)
	public ModelAndView error_404(ModelMap modelMap) {
		modelMap.put("errorMessage", "404&nbsp;&nbsp;找不到家�?!");
		return new ModelAndView("commons/error", modelMap);
	}

	@RequestMapping(value = "500", method = RequestMethod.GET)
	public ModelAndView error_500(ModelMap modelMap) {
		modelMap.put("errorMessage", "500&nbsp;&nbsp;出错�?!");
		return new ModelAndView("commons/error", modelMap);
	}

}
