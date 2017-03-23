package com.example.exception;

import com.example.enums.ErrorCode;

/**
 * Created by Ricky on 2017/3/24.
 */
public class TestException extends RuntimeException {

    private ErrorCode errorCode;

    public TestException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public TestException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
