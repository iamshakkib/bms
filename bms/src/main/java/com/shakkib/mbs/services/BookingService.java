package com.shakkib.mbs.services;

import com.shakkib.mbs.entities.Booking;
import com.shakkib.mbs.exceptions.BookingDetailsNotFoundException;
import com.shakkib.mbs.exceptions.MovieTheatreDetailsNotFoundException;
import com.shakkib.mbs.exceptions.UserDetailsNotFoundException;

import java.util.List;

public interface BookingService {

    public Booking acceptBookingDetails(Booking booking) throws MovieTheatreDetailsNotFoundException,
            UserDetailsNotFoundException;
    public Booking getBookingDetails(int id) throws BookingDetailsNotFoundException;
    public boolean deleteBooking(int id) throws BookingDetailsNotFoundException;
    public List<Booking> getAllBookingDetails();

}
