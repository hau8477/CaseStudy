package controllers;

import models.booking.Booking;
import services.impl.BookingService;

import java.util.List;

public class BookingController {
    private static final BookingService bookingService = new BookingService();

    public void addNew(Booking object) {
        bookingService.addNew(object);
    }

    public List<Booking> getList(){
        return bookingService.getList();
    }
}
