package com.bingbing.designpatterns.adapter.demo.adapterv2;

import com.bingbing.designpatterns.adapter.demo.ResultMsg;
import com.bingbing.designpatterns.adapter.demo.adapterv2.adapters.*;

/**
 * @author bingbing
 * @Created 2023/2/8 10:49 下午
 */
public class PassportForThirdAdapter implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return processLogin(openId, LoginForWechatAdapter.class);

    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);

    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return processLogin(phone, LoginForTelAdapter.class);
    }


    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id,adapter);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
