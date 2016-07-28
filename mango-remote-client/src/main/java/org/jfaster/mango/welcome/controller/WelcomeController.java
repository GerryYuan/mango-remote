package org.jfaster.mango.welcome.controller;

import org.jfaster.mango.welcome.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gerry.common.framework.helper.ViewModelHelper;
import com.gerry.common.framework.result.ViewModelResult;
import com.gerry.common.framework.springmvc.controller.BaseController;

@Controller
@RequestMapping("/welcome")
public class WelcomeController extends BaseController {

	@Autowired
	private WelcomeService welcomeService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public ViewModelResult<?> welcome(@RequestParam(required = true, value = "id") Integer id) {
		return ViewModelHelper.OKViewModelResult(welcomeService.getById(id));
	}

}
