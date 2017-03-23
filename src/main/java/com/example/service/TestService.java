package com.example.service;

import com.example.enums.ErrorCode;
import com.example.exception.TestException;
import org.springframework.stereotype.Service;

/**
 * Created by Ricky on 2017/3/24.
 */
@Service
public class TestService {

    public void test1() {
        throw new TestException(ErrorCode.TEST_ERROR1);
    }
}
