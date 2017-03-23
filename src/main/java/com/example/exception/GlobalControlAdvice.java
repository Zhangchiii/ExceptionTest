package com.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ricky on 2017/3/24.
 */
@ControllerAdvice
public class GlobalControlAdvice {

    @ExceptionHandler(TestException.class)
    @ResponseBody
    public String exceptionHandler(TestException e) {
        e.printStackTrace();
        return e.getMessage();
    }
}
