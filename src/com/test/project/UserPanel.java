package com.test.project;

// UserPanel class :-

import java.util.List;


public class UserPanel {
	
private Database db; // Database object for accessing flight details and booking records
    
    public UserPanel(Database db) {
        this.db = db;
    }
    
    public List<Flight> viewFlights() {
        // code for fetching flight details from the database and returning a list of Flight objects
    }
    
    public void bookFlight(int flightId, int userId, String date, double price) {
        // code for booking a flight and adding booking details to the database
    }
    
    public List<Booking> viewBookings(int userId) {
        // code for fetching booking records of a particular user from the database and returning a list of Booking objects
    }

}
