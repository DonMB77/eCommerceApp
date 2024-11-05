package services.impl;

import enteties.User;
import services.UserManagementService;

public class DefaultUserManagementService implements UserManagementService {
	
	private static final String NOT_UNIQUE_EMAIL_ERROR_MESSAGE = "This email is already used by another user. Please, use another email";
	private static final String EMPTY_EMAIL_ERROR_MESSAGE = "You have to input email to register. Please, try one more time";
	private static final String NO_ERROR_MESSAGE = "";
	
	private static final int DEFAULT_USERS_CAPACITY = 10;
	
	private static DefaultUserManagementService instance;
	
	// implementation pending

	private DefaultUserManagementService() {
	}
	
	@Override
	public String registerUser(User user) {
		// implementation pending
		return null;
	}

	public static UserManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultUserManagementService();
		}
		return instance;
	}

	
	@Override
	public User[] getUsers() {
		// implementation pending
		return null;
	}

	@Override
	public User getUserByEmail(String userEmail) {
		// implementation pending
		return null;
	}
	
	void clearServiceState() {
		// implementation pending
	}
}
