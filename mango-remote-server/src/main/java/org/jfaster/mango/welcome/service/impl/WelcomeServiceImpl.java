package org.jfaster.mango.welcome.service.impl;

import org.jfaster.mango.welcome.dao.WelcomeDAO;
import org.jfaster.mango.welcome.model.Welcome;
import org.jfaster.mango.welcome.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;

public class WelcomeServiceImpl implements WelcomeService{

	@Autowired
	private WelcomeDAO welcomeDAO;
	
	@Override
	public Welcome getById(Integer id) {
		return welcomeDAO.getWelcome(id);
	}

	@Override
	public int save(Welcome t) {
		return 0;
	}

	@Override
	public int delete(Integer id) {
		return 0;
	}

	@Override
	public int update(Welcome t) {
		return 0;
	}

}
