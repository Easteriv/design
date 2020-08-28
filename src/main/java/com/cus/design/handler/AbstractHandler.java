package com.cus.design.handler;

/**
 * @author zhaojiejun
 * @date 2020/8/27 11:56 下午
 **/
public abstract class AbstractHandler {
    protected AbstractHandler successor;
    public void setSuccessor(AbstractHandler abstractHandler){
        this.successor = abstractHandler;
    }

    /**
     * 处理文章
     * @param article 文章内容数据
     */
    public abstract void doHandler(Article article);

    protected void next(Article article){
        if(this.successor!=null){
            this.successor.doHandler(article);
        }
    }
}
