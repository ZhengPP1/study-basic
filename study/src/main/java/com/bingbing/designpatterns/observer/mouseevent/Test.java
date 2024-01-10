package com.bingbing.designpatterns.observer.mouseevent;

/**
 * @author bingbing
 */
public class Test {
    public static void main(String[] args) {
        EventListener mouseEventListener = new MouseEventListener();
        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK,mouseEventListener);
        mouse.addListener(MouseEventType.ON_MOVE,mouseEventListener);

        mouse.click();
        mouse.move();

    }
}
