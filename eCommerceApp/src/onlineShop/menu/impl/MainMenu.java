package onlineShop.menu.impl;

import onlineShop.configs.ApplicationContext;
import onlineShop.menu.Menu;
import onlineShop.Main;

import java.util.Scanner;

public class MainMenu implements Menu {

	public static final String MENU_COMMAND = "menu";
	
	private static final String MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER = "Please, enter number in console to proceed." + System.lineSeparator()
			+ "1. Sign Up" + System.lineSeparator() + "2. Sign In"
			+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
			+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() + 
			"6. Customer List";

	private static final String MAIN_MENU_TEXT_FOR_LOGGED_IN_USER = "Please, enter number in console to proceed." + System.lineSeparator()
			+ "1. Sign Up" + System.lineSeparator() + "2. Sign Out"
			+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
			+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() + 
			"6. Customer List";;

	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		boolean runCondition = true;
		while (runCondition == true) {
			if (context.getMainMenu() == null) {
				context.setMainMenu(this);
			}

			Menu menuToNavigateTo = null;
			mainLoop: while (true) {
				printMenuHeader();

				Scanner sc = new Scanner(System.in);

				System.out.println("User input: ");
				String userChoice = sc.next();
				if (userChoice.equalsIgnoreCase(Main.EXIT_COMMAND)) {
					System.exit(0);
				} else {
					int commandNumber = Integer.parseInt(userChoice);
					switch (commandNumber) {
						case 1:
							menuToNavigateTo = new SignUpMenu();
							break mainLoop;
						case 2:
							if (context.getLoggedInUser() == null) {

							}
					}
				}
			}
		}
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("----- Main Menu -----");
		if (context.getLoggedInUser() == null) {
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER);
		} else {
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_IN_USER);
		}
	}

}
