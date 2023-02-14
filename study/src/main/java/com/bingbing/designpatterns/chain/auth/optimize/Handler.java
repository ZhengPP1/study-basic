package com.bingbing.designpatterns.chain.auth.optimize;

import com.bingbing.designpatterns.chain.auth.Member;

/**
 * @author : bingbing
 */
public abstract class Handler {
    protected Handler chain;

    public void next(Handler handler) {
        this.chain = handler;

    }
    public abstract void doHandle(Member member);

}
