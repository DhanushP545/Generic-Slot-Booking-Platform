package com.slotbooking.exception;

public class SlotAlreadyBookedException extends BookingPlatformException {

    public SlotAlreadyBookedException(String slotId) {
        super("SLOT_ALREADY_BOOKED",
                "Slot is already booked : " + slotId);
    }
}
