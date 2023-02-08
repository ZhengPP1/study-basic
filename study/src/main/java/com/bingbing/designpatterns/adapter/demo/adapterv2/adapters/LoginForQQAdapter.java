package com.bingbing.designpatterns.adapter.demo.adapterv2.adapters;

import com.bingbing.designpatterns.adapter.demo.ResultMsg;

/**
 * @author bingbing
 * @Created 2023/2/8 10:35 下午
 */
public class LoginForQQAdapter extends AbstractAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)){
            return null;
        }
        return super.loginForRegist(id,"");
    }
}
