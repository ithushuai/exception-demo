package com.hushuai.response;

import com.hushuai.enums.ResultCode;
import org.springframework.http.HttpStatus;

/**
 * created by it_hushuai
 * 2020/2/14 12:26
 */
public class ResponseResult<T> {
    private boolean success;//是否操作成功
    private HttpStatus code;//操作状态码，rest风格
    private String message;//操作结果详细信息
    private T data;//实体类数据

    public ResponseResult(ResultCode rc) {
        this.success = rc.isSuccess();
        this.code = rc.getCode();
        this.message = rc.getMessage();
    }

    public ResponseResult(ResultCode rc, T data) {
        this.success = rc.isSuccess();
        this.code = rc.getCode();
        this.message = rc.getMessage();
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
