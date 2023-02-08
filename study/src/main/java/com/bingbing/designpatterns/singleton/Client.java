package com.bingbing.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试序列化情况下的单例模式
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        SeriableSingleton s1=null;
        SeriableSingleton s2=SeriableSingleton.getInstance();

        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis=new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois=new ObjectInputStream(fis);
            s1=(SeriableSingleton) ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
