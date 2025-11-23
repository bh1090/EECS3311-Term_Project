package application;

import model.User;

public class SessionData {
	private static User currentUser;
	
	public static User getCurrentUser() {
		return currentUser;
	}

}
