package onlineShop.menu.impl;

import onlineShop.configs.ApplicationContext;
import onlineShop.menu.Menu;
import onlineShop.services.UserManagementService;
import onlineShop.services.impl.DefaultUserManagementService;

public class SignInMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>	
	}

}
