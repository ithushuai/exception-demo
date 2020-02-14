package com.hushuai.controller;

import com.hushuai.entity.Item;
import com.hushuai.enums.ResultCode;
import com.hushuai.exception.MyException;
import com.hushuai.response.ResponseResult;
import com.hushuai.service.ItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * created by it_hushuai
 * 2020/2/13 22:01
 */
@RestController
@RequestMapping("/item")
public class ItemController {
    @Resource
    private ItemService itemService;

    @PostMapping("/save")
    public ResponseResult<Item> saveItem(@RequestBody Item item){
        if(item.getName() == null){
            throw new MyException(ResultCode.NAME_CANNOT_BE_NULL);
        }
        item = itemService.saveItem(item);
        return new ResponseResult<>(ResultCode.ADD_ITEM_SUCCESS, item);
    }
}
