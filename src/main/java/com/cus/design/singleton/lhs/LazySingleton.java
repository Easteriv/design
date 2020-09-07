package com.cus.design.singleton.lhs;

/**
 * 懒汉式
 * @author zhaojiejun
 * @date 2020/9/7 9:48 下午
 **/
public class LazySingleton {
    private static LazySingleton INSTANCE = null;
    /**
     * 静态构造
     */
    private LazySingleton(){};

    /**
     * 提供公共方法
     * @return 生成全局唯一类
     */
    public static  LazySingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
