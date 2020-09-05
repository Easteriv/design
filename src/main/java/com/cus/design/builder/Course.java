package com.cus.design.builder;

import lombok.ToString;

/**
 * builder构造者模式演示
 * @author zhaojiejun
 * @date 2020/9/5 12:32 下午
 **/
@ToString
public class Course {
    private final String title;
    private final String content;
    private final String author;
    private final Long learnCount;
    private final Long like;

    /**
     * 构造方法，用来将CourseBuild值赋值给course
     * @param courseBuild CourseBuild 参数
     */
    public Course(CourseBuild courseBuild) {
        this.title = courseBuild.title;
        this.content = courseBuild.content;
        this.author = courseBuild.author;
        this.learnCount = courseBuild.learnCount;
        this.like = courseBuild.like;
    }

    /**
     * 静态方法构造出CourseBuild对象
     * @return CourseBuild 返回CourseBuild对象
     */
    public static CourseBuild builder(){
        return new CourseBuild();
    }

    /**
     * 静态内部类
     */
    public static class CourseBuild{
        private  String title;
        private String content;
        private String author;
        private Long learnCount;
        private Long like;
        public CourseBuild buildTitle(String title){
            this.title = title;
            return this;
        }
        public CourseBuild buildContent(String content){
            this.content = content;
            return this;
        }
        public CourseBuild buildAuthor(String author){
            this.author = author;
            return this;
        }
        public CourseBuild buildLearnCount(Long learnCount){
            this.learnCount = learnCount;
            return this;
        }
        public CourseBuild buildLike(Long like){
            this.like = like;
            return this;
        }
        public Course build(){
           return new Course(this);
        }
    }
}
