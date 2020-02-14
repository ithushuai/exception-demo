package com.hushuai.enums;

import org.springframework.http.HttpStatus;

public enum ResultCode {
    ADD_ITEM_SUCCESS(true, HttpStatus.CREATED,"添加商品成功！"),
    NAME_CANNOT_BE_NULL(false, HttpStatus.BAD_REQUEST, "名称不能为空"),
    ;
    //操作是否成功
    boolean success;
    //操作代码
    HttpStatus code;
    //提示信息
    String message;
    private ResultCode(boolean success, HttpStatus code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public HttpStatus getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
