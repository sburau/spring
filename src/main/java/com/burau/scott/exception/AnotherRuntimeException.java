package com.burau.scott.exception;


public class AnotherRuntimeException extends RuntimeException {
    public AnotherRuntimeException() {
    }

    public AnotherRuntimeException(String message) {
        super(message);
    }

    public AnotherRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnotherRuntimeException(Throwable cause) {
        super(cause);
    }

    public AnotherRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
