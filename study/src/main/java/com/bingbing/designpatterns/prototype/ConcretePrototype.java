package com.bingbing.designpatterns.prototype;



import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * 原型模式
 * @author : bingbing
 */
@Data
public class ConcretePrototype implements Cloneable, Serializable {

    private int age;
    private String name;
    private List<String> hobbies;
    /**
     * 浅克隆
     * 如果原型对象的成员变量是值类型，将复制一份给克隆对象；
     * 如果原型对象的成员变量是引用类型，则将引用对象的地址复制一份给克隆对象，也就是说原型对象和克隆对象的成员变量指向相同的内存地址。
     *
     *
     * super.clone（）方法直接从堆内存中以二进制流的方式进行复制，重新分配一个内存块，因此其效率很高。
     * 由于super.clone（）方法基于内存复制，因此不会调用对象的构造函数，也就是不需要经历初始化过程
     * @return
     */
    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype)super.clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 深克隆 java中实现深克隆一般是使用序列化的方式
     * 无论原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，
     * 深克隆将原型对象的所有引用对象也复制一份给克隆对象。简言之，深克隆，除了对象本身被复制外，对象所包含的所有成员变量也将复制。
     * @return
     */
    public ConcretePrototype deepClone(){
        try {
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bis);
            return (ConcretePrototype)ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
