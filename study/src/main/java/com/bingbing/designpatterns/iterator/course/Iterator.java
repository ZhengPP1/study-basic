package com.bingbing.designpatterns.iterator.course;

/**
 * Created by Tom.
 */
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
