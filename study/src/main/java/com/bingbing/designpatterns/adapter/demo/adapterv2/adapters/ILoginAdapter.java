package com.bingbing.designpatterns.adapter.demo.adapterv2.adapters;

import com.bingbing.designpatterns.adapter.demo.ResultMsg;

/**
 * @author bingbing
 * @Created 2023/2/8 10:32 下午
 */
public interface ILoginAdapter {

    boolean support(Object object);

    ResultMsg login(String id,Object adapter);
}
