package com.burau.scott.exception;


public class AnotherException extends Exception {
    public AnotherException() {
    }

    public AnotherException(String message) {
        super(message);
    }

    public AnotherException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnotherException(Throwable cause) {
        super(cause);
    }

    public AnotherException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
