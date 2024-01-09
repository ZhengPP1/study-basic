package com.bingbing.designpatterns.memento.general;

/**
 * @author bingbing
 */
public class Client2 {

    /**
     * 发起人角色
     */
    static class Originator{
        private String state;

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
        // 创建一个备忘录
        public Memento createMemento(){
            return new Memento(this.state);
        }
        // 从备忘录恢复
        public void restoreMemento(Memento memento){
            this.setState(memento.state);
        }
        /**
         * 喵啊～
         * 备忘录角色
         * 把Memento作为Originator的私有静态内部类，这样就满足了Originator对Memento具有宽访问权限，
         * 但是直接这样做，其他类（Caretaker）是无法访问Memento的。因此，通过定义一个空接口IMemento，然后让Memento实现IMemento，
         * 变相将Memento扩展为公有IMemento，这样就实现了其他类（Caretaker）对Memento具备窄访问权限。这种形式才算严格满足备忘录模式的设计要求。
         */
        static class Memento implements IMemento{
            private String state;

            private Memento(String state) {
                this.state = state;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }
        }
    }


    interface IMemento{

    }

    /**
     * 备忘录管理者角色
     */
    static class Caretaker{
        // 备忘录对象
        private IMemento memento;

        public IMemento getMemento() {
            return memento;
        }

        public void setMemento(IMemento memento) {
            this.memento = memento;
        }
    }
}
