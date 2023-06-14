package com.bingbing.designpatterns.iterator.course;

import java.util.List;

/**
 * @author : bingbing
 */
public class IteratorImpl<E> implements Iterator<E> {

    private List<E> list;

    private int cursor;

    private E element;

    public IteratorImpl(List<E> list) {

        this.list = list;
    }

    @Override
    public E next() {
        element = list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if(cursor > list.size()-1){
            return false;
        }
        return true;
    }
}
