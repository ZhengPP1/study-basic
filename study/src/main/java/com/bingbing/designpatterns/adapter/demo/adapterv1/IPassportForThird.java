package com.bingbing.designpatterns.adapter.demo.adapterv1;

import com.bingbing.designpatterns.adapter.demo.ResultMsg;

/**
 * ITarget角色
 *
 *
 * @author : bingbing
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone,String code);
}
