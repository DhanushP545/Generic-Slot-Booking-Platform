package com.slotbooking.exception;

public abstract class BookingPlatformException extends RuntimeException {

    private final String errorCode;

    protected BookingPlatformException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
