package com.cus.design.build;

import com.cus.design.builder.Course;
import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/9/5 12:42 下午
 **/
public class BuildTest {
    @Test
    public void testBuild(){
        Course build =  Course.builder().buildAuthor("author").buildTitle("title").build();
        System.out.println(build);
    }
}
