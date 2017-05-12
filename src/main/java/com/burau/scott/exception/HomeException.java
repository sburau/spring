package com.burau.scott.exception;


public class HomeException extends Exception{
    public HomeException() {
    }

    public HomeException(String message) {
        super(message);
    }

    public HomeException(String message, Throwable cause) {
        super(message, cause);
    }

    public HomeException(Throwable cause) {
        super(cause);
    }

    public HomeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
