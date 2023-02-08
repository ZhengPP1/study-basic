package com.bingbing.designpatterns.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 适用于需要大量创建单例对象的场景，便于管理，但它是非线程安全的
 * 容器式单例
 * @author : bingbing
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    public static Map<String,Object> ioc=new ConcurrentHashMap<String,Object>();
    public static  Object getBean(String className){
        synchronized (ioc){
            if (!ioc.containsKey(className)){
                Object obj=null;
                try {
                    obj=Class.forName(className).newInstance();
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }else {
                return ioc.get(className);
            }
        }

    }
}
