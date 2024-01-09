package com.bingbing.designpatterns.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author bingbing
 */
public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("TOM");
    }
}
