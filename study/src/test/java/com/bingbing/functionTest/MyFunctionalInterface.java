package com.bingbing.functionTest;

/**
 * 函数式接口
 */
public interface MyFunctionalInterface {
    public abstract void method();

}

 class demo{
    public static void show(MyFunctionalInterface myFunctionalInterface){

        myFunctionalInterface.method();
    }

     public static void main(String[] args) {
         // show(new FunctionalInterfaceImpl());

         show(new MyFunctionalInterface() {
             @Override
             public void method() {
                 System.out.println("匿名接口内部类");;
             }
         });

         show(()->{
             System.out.println("匿名接口内部类111");
         });

         show(()-> System.out.println("123"));
     }
}
