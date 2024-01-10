package com.bingbing.designpatterns.visitor.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 通用写法
 * @author bingbing
 */
public class client {
    /**
     * 抽象元素（IElement）：接口或抽象类，
     * 定义了一个接受访问者访问的方法accept（），
     * 表示所有元素类型都支持被访问者访问。
     */
    interface IElement{
        void accept(IVisitor visitor);

    }

    /**
     * 具体元素类型，提供接受访问者的具体实现。通常的实现都为visitor.visit（this）。
     */
    static class ConcreteElementA implements IElement{
        @Override
        public void accept(IVisitor visitor) {
            visitor.visit(this);
        }

        public String operationA(){
            return getClass().getSimpleName();
        }
    }
    static class ConcreteElementB implements IElement{
        @Override
        public void accept(IVisitor visitor) {
            visitor.visit(this);
        }

        public int operationB(){
            return new Random().nextInt();
        }
    }

    /**
     * 接口或抽象类，该类定义了一个visit（）方法用于访问每一个具体的元素，
     * 其参数就是具体的元素对象。从理论上来说，IVisitor的方法个数与元素个数是相等的。
     * 如果元素个数经常变动，则导致IVisitor的方法也要进行变动，此时，该情形并不适用于访问者模式
     */
    interface IVisitor{
        void visit(ConcreteElementA concreteElementA);
        void visit(ConcreteElementB concreteElementB);

    }


    static class ConcreteVisitorA implements IVisitor{
        @Override
        public void visit(ConcreteElementA element) {
            String result = element.operationA();
            System.out.println(element.getClass().getSimpleName()+result);
        }

        @Override
        public void visit(ConcreteElementB element) {
            int result = element.operationB();
            System.out.println(element.getClass().getSimpleName()+result);
        }
    }


    static class ConcreteVisitorB implements IVisitor{
        @Override
        public void visit(ConcreteElementA element) {
            String result = element.operationA();
            System.out.println(element.getClass().getSimpleName()+result);
        }

        @Override
        public void visit(ConcreteElementB element) {
            int result = element.operationB();
            System.out.println(element.getClass().getSimpleName()+result);
        }
    }

    /**
     * 内部维护了元素集合，并提供方法接受访问者对该集合所有元素进行操作。
     */
    static class ObjectStructure{
        private List<IElement> list=new ArrayList<>();
        {
            list.add(new ConcreteElementA());
            list.add(new ConcreteElementB());

        }
        public void accept(IVisitor visitor){
            for (IElement element : this.list) {
                element.accept(visitor);
            }

        }
    }

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        System.out.println("ConcreteVisitorA handle elements");
        IVisitor visitorA = new ConcreteVisitorA();
        objectStructure.accept(visitorA);
        System.out.println("ConcreteVisitorB handle elements");

        IVisitor visitorB = new ConcreteVisitorB();
        objectStructure.accept(visitorB);

    }
}
