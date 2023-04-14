package com.test.project;

//User Class :-

import java.util.List;

public class User {
	
	 private int userId;
	    private String username;
	    private String password;
	    private String email;
	    private List<Booking> bookings;
	    
	    public User(int userId, String username, String password, String email, List<Booking> bookings) {
	        this.userId = userId;
	        this.username = username;
	        this.password = password;
	        this.email = email;
	        this.bookings = bookings;
	    }
	    
	    // getters and setters for all the user details

}
