package com.hushuai.service;

import com.hushuai.entity.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * created by it_hushuai
 * 2020/2/13 22:01
 */
@Service
public class ItemService {

    public Item saveItem(Item item){
        int id = new Random().nextInt(100);
        item.setNo(id);
        return item;
    }
}
