package com.hushuai.advice;

import com.hushuai.enums.ResultCode;
import com.hushuai.exception.MyException;
import com.hushuai.response.ResponseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by it_hushuai
 * 2020/2/14 11:12
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public ResponseResult<Void> exceptionHandle(MyException e){
        ResultCode rc = e.getExceptionEnum();
        return new ResponseResult<>(rc);
    }
}
