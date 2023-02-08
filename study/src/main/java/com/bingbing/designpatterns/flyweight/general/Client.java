package com.bingbing.designpatterns.flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式的通用写法
 *
 * @author : bingbing
 */
public class Client {


    interface IFlyweight {
        void operation(String extrinsicState);
    }

    /**
     * 具体享元角色
     */
    static class ConcreteFlyweight implements IFlyweight{
        private String intrinsicState;
        public ConcreteFlyweight(String intrinsicState) {
            this.intrinsicState = intrinsicState;
        }

        @Override
        public void operation(String extrinsicState) {
            System.out.println("object address:"+System.identityHashCode(this));

            System.out.println("intrinsicState:"+this.intrinsicState);
            System.out.println("extrinsicState:"+extrinsicState);

        }
    }

    /**
     * 享元工厂
     */
    static class FlyweightFactory{
        private static Map<String,IFlyweight> pool=new HashMap<String,IFlyweight>();
        //因为内部状态具有不变性。所以作为缓存的键
        public static IFlyweight getFlyweight(String intrinsicState){
            if (!pool.containsKey(intrinsicState)){
                IFlyweight flyweight=new ConcreteFlyweight(intrinsicState);
                pool.put(intrinsicState,flyweight);
            }
            return pool.get(intrinsicState);
        }

    }

}
