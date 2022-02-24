package com.example.study_exception;

/**
 *
 * 커스텀 예외클래스 작성
 * - Unchecked Exception 생성할 경우 RuntimeException 상속
 * - Checked Exception 생성할 경우 Exception 상속
 *
 */
public class UnderAgeException extends RuntimeException {

    public UnderAgeException() {
        super();
    }

    public UnderAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UnderAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnderAgeException(String message) {
        super(message);
    }

    public UnderAgeException(Throwable cause) {
        super(cause);
    }

}
