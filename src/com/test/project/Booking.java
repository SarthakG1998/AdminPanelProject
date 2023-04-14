package com.test.project;

// Booking Class :-

public class Booking {
	
	 private int bookingId;
	    private int flightId;
	    private int userId;
	    private String date;
	    private double price;
	    
	    public Booking(int bookingId, int flightId, int userId, String date, double price) {
	        this.bookingId = bookingId;
	        this.flightId = flightId;
	        this.userId = userId;
	        this.date = date;
	        this.price = price;
	    }
	    
	    // getters and setters for all the booking details

}
