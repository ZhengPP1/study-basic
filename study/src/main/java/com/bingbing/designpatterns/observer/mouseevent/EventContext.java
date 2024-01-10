package com.bingbing.designpatterns.observer.mouseevent;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 被观察者的抽象
 *
 * @author bingbing
 */
public abstract class EventContext {

    protected Map<String, Event> events = new HashMap<>();

    public void addListener(String eventType, EventListener target, Method callback) {
        events.put(eventType, new Event(target, callback));
    }

    public void addListener(String eventType, EventListener target) {
        try {
            this.addListener(eventType, target, target.getClass().getMethod("on" + toUpperFirstCase(eventType), Event.class));
        } catch (NoSuchMethodException e) {
            return;
        }
    }

    private String toUpperFirstCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        if (event.getCallback() != null) {
            try {
                event.getCallback().invoke(event.getTarget(), event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    protected void trigger(String trigger){
        if (!this.events.containsKey(trigger)){
            return;
        }
        trigger(this.events.get(trigger).setTrigger(trigger));
    }

}

