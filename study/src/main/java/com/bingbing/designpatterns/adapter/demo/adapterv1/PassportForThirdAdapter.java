package com.bingbing.designpatterns.adapter.demo.adapterv1;

import com.bingbing.designpatterns.adapter.demo.PassportService;
import com.bingbing.designpatterns.adapter.demo.ResultMsg;

/**
 * @author : bingbing
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegist(token,null);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegist(phone,code);
    }


    private ResultMsg loginForRegist(String username,String password){
        if (null==password){
            password="third_empty";
        }

        super.regist(username,password);
        return super.login(username,password);
    }

}
