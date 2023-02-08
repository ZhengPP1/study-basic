package com.bingbing.designpatterns.adapter.demo.adapterv2.adapters;

import com.bingbing.designpatterns.adapter.demo.ResultMsg;

/**
 * @author bingbing
 * @Created 2023/2/8 10:45 下午
 */
public class LoginForTelAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }
}
