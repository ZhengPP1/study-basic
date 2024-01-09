package com.bingbing.designpatterns.memento.general;

/**
 * @author bingbing
 */
public class Client {

    /**
     * 发起人角色
     */
    static class Originator {
        private String state;

        public Originator(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        // 创建一个备忘录
        public Memento createMemento() {
            return new Memento(this.state);
        }

        // 从备忘录恢复
        public void restoreMemento(Memento memento) {
            this.setState(memento.state);
        }
    }

    /**
     * 备忘录角色
     */
    static class Memento {
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }


    /**
     * 备忘录管理者角色
     */
    static class Caretaker {
        // 备忘录对象
        private Memento memento;

        public Memento getMemento() {
            return memento;
        }

        public void storeMemento(Memento memento) {
            this.memento = memento;
        }
    }

    public static void main(String[] args) {
        // 创建发起人
        Originator originator = new Originator("测试");
        // 创建管理人
        Caretaker caretaker = new Caretaker();
        // 管理员存储发起人的备忘录
        caretaker.storeMemento(originator.createMemento());
        // 发起人从管理员获取备忘录进行回滚
        originator.restoreMemento(caretaker.getMemento());
    }
}
