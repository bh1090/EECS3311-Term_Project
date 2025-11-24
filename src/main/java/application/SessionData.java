package application;

import model.User;

public class SessionData {
	private static User currentUser = new User();
	
	public static User getCurrentUser() {
		return currentUser;
	}

}
