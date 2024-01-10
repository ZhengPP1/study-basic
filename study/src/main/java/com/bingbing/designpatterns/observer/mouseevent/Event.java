package com.bingbing.designpatterns.observer.mouseevent;

import java.lang.reflect.Method;

/**
 * @author bingbing
 */
public class Event {


    /**
     * 事件源，动作是谁发出的
     */
    private Object source;
    /**
     * 事件触发，要通知谁
     */
    private EventListener target;
    /**
     * 观察者的回应
     */
    private Method callback;

    /**
     * 事件的名称
     */
    private String trigger;

    /**
     * 事件的触发时间
     */
    private long time;

    public Event(EventListener target, Method callback) {

        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public EventListener getTarget() {
        return target;
    }

    public Method getCallback() {
        return callback;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
