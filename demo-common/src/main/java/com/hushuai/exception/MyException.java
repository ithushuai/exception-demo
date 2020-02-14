package com.hushuai.exception;

import com.hushuai.enums.ResultCode;

/**
 * created by it_hushuai
 * 2020/2/13 22:20
 */
public class MyException extends RuntimeException{
    private ResultCode resultCode;

    public MyException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public MyException() {
    }

    public ResultCode getExceptionEnum() {
        return resultCode;
    }

    public void setExceptionEnum(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
