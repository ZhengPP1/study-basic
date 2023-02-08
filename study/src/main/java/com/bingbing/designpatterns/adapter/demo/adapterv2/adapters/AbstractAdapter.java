package com.bingbing.designpatterns.adapter.demo.adapterv2.adapters;

import com.bingbing.designpatterns.adapter.demo.PassportService;
import com.bingbing.designpatterns.adapter.demo.ResultMsg;

/**
 * @author bingbing
 * @Created 2023/2/8 10:34 下午
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {

    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }

}
