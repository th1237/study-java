package com.homework.test.exception.charcheck;

public class CharCheckException extends RuntimeException{

    public CharCheckException() {
        super();
    }

    public CharCheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CharCheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public CharCheckException(String message) {
        super(message);
    }

    public CharCheckException(Throwable cause) {
        super(cause);
    }
}
