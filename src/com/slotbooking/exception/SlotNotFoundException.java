package com.slotbooking.exception;

public class SlotNotFoundException extends BookingPlatformException {

    public SlotNotFoundException(String slotId) {
        super("SLOT_NOT_FOUND",
                "Slot not found : " + slotId);
    }
}