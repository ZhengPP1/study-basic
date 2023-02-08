package com.bingbing.designpatterns.composite.general.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * 安全组合模式只规定系统各个层次的最基础的一致行为，而把组合（节点）本身的方法（管理子类对象的添加、删除等）放到自身当中。
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        // 来一个根节点
        Composite root = new Composite("root");
        // 来一个树枝节点
        Composite branchA = new Composite("---branchA");
        Composite branchB = new Composite("------branchB");
        // 来一个叶子节点
        Component leafA = new Leaf("------leafA");
        Component leafB = new Leaf("---------leafB");
        Component leafC = new Leaf("---leafC");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);

        String result = root.operation();
        System.out.println(result);
    }
    // 抽象根节点
    static abstract class Component {
        protected String name;

        public Component(String name) {
            this.name = name;
        }

        public abstract String operation();
    }

    // 树节点
    static class Composite extends Component {
        private List<Component> components;

        public Composite(String name) {
            super(name);
            this.components = new ArrayList<>();
        }

        @Override
        public String operation() {
            StringBuilder builder = new StringBuilder(this.name);
            for (Component component : this.components) {
                builder.append("\n");
                builder.append(component.operation());
            }
            return builder.toString();
        }


        public boolean addChild(Component component) {
            return this.components.add(component);
        }


        public boolean removeChild(Component component) {
            return this.components.remove(component);
        }


        public Component getChild(int index) {
            return this.components.get(index);
        }

    }

    //叶子节点
    static class Leaf extends Component {

        public Leaf(String name) {
            super(name);
        }

        @Override
        public String operation() {
            return this.name;
        }
    }

}
