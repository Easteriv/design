package com.cus.design.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaojiejun
 * @date 2020/8/15 11:39 上午
 **/
public class IteratorTest {
    @Test
    public void testArrayIterator(){
        List<String>list = new ArrayList<>();
        list.add("3");
        Iterator<String>arrayIterator = new ArrayIterator<>(list);
        while (arrayIterator.hasNext()){
            String s = arrayIterator.currentItem();
            System.out.println(s);
            arrayIterator.next();
        }
    }
}
