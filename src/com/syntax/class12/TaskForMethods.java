package com.syntax.class12;

public class TaskForMethods {

	public static void main(String[] args) {
		/*
		 * Store username, password and confirm password from a user and check following
		 * requirements: Username and Password cannot be empty, if so→ message=”Username
		 * and Password cannot be empty”. Password should be minimum 8 characters, if
		 * less → message=”Password is too short”. Password cannot contain username if
		 * so, → message=”Password cannot contain username”. Password should match
		 * confirmed password, if not → message=“Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */
		String username = "admin";
		String password = "pass1234";
		String confirmPassword = "pass1234";
		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("username and password can not be empty");
		} else if (password.length() < 8) {
			System.out.println("password is too short");
		} else if (username.contains(password)) {
			System.out.println("password can not contain username");
		} else if (!password.equals(confirmPassword)) {
			System.out.println("Password dose not match");
		} else {
			System.out.println("you have succefully created username and password");
		}
	}

}
