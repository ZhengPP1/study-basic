package com.bingbing.designpatterns.composite.general.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * 透明组合模式
 * 透明组合模式是把所有公共方法都定义在Component中，这样做的好处是客户端无须分辨叶子节点和树枝节点，它们具备完全一致的接口.
 *
 * @author : bingbing
 */
public class Client {


    public static void main(String[] args) {
        Component root=new Composite("root");
        Composite branchA = new Composite("---branchA");
        Composite branchB = new Composite("------branchB");

        Leaf leafA = new Leaf("-------leafA");
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
    static abstract class Component {
        protected String name;

        public Component(String name) {
            this.name = name;
        }

        public abstract String operation();

        public boolean addChild(Component component) {

            throw new UnsupportedOperationException("addChild not supported!");
        }

        public boolean removeChild(Component component) {
            throw new UnsupportedOperationException("removeChild not supported!");
        }

        public Component getChild(int index) {
            throw new UnsupportedOperationException("getChild not supported!");
        }

    }

    /**
     * 树枝节点
     */
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

            throw new UnsupportedOperationException("addChild not supported!");
        }

        public boolean removeChild(Component component) {
            throw new UnsupportedOperationException("removeChild not supported!");
        }

        public Component getChild(int index) {
            throw new UnsupportedOperationException("getChild not supported!");
        }
    }




    static class Leaf extends Component{

        public Leaf(String name) {
            super(name);
        }

        @Override
        public String operation() {
            return this.name;
        }
    }

}
