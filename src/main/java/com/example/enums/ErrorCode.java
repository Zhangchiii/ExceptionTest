package com.example.enums;

/**
 * Created by Ricky on 2017/3/24.
 */
public enum ErrorCode {

    TEST_ERROR1("错误1", 1),
    TEST_ERROR2("错误2", 2);

    private String message;
    private Integer code;

    ErrorCode(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
