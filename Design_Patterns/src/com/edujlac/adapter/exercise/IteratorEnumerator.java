package com.edujlac.adapter.exercise;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerator<E> implements Enumeration<E> {

    Iterator<E> iterator;

    public IteratorEnumerator(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public E nextElement() {
        return iterator.next();
    }
}
