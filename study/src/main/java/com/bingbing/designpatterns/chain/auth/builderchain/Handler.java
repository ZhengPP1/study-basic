package com.bingbing.designpatterns.chain.auth.builderchain;

import com.bingbing.designpatterns.chain.auth.Member;

/**
 * 责任链模式和建造者模式结合使用
 * @author : bingbing
 */
public abstract class Handler<T> {

    protected Handler chain;

    public void next(Handler handler){
        this.chain=handler;
    }

    public abstract void doHandler(Member member);

    public static class Builder<T>{
        private Handler<T> head;
        private Handler<T> tail;
        public Builder<T> addHandler(Handler<T> handler){

            if (this.head==null){
                this.head=this.tail=handler;
                return this;
            }
            this.tail.next(handler);
            this.tail=handler;

            return this;
        }

        public Handler<T> build(){
            return this.head;
        }
    }


}
