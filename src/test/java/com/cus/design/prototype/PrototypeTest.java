package com.cus.design.prototype;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaojiejun
 * @date 2020/9/22 11:45 下午
 **/
public class PrototypeTest {
    @Test
    public void testObj() {
        List<Book> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Book book = new Book();
            book.setAuthor(String.valueOf(i));
            list.add(book);
        }
        System.out.println(list);
    }
}
