package com.example.service;

import com.example.enums.ErrorCode;
import com.example.exception.TestException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Created by Ricky on 2017/3/24.
 */
@Service
public class TestService {

    public void test1() {
        throw new TestException(ErrorCode.TEST_ERROR1);
    }

    public void test2() {
        try {
            throw new SQLException();
        } catch (SQLException e) {
            throw new TestException(ErrorCode.TEST_ERROR2, e);
        }

    }
}
