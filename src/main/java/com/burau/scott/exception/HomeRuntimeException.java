package com.burau.scott.exception;


public class HomeRuntimeException extends RuntimeException {
    public HomeRuntimeException() {
    }

    public HomeRuntimeException(String message) {
        super(message);
    }

    public HomeRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public HomeRuntimeException(Throwable cause) {
        super(cause);
    }

    public HomeRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
