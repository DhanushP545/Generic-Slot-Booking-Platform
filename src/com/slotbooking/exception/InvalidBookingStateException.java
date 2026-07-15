package com.slotbooking.exception;

public class InvalidBookingStateException extends BookingPlatformException {

    public InvalidBookingStateException(String message) {
        super("INVALID_BOOKING_STATE", message);
    }
}
