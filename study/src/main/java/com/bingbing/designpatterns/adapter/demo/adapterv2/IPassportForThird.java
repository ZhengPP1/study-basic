package com.bingbing.designpatterns.adapter.demo.adapterv2;

import com.bingbing.designpatterns.adapter.demo.ResultMsg;

/**
 * @author bingbing
 * @Created 2023/2/8 10:49 下午
 */
public interface IPassportForThird {


    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);
}
