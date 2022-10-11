package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.LinkedList;
import java.util.List;

public class PilaLinked<T> {
    private LinkedList<T> tLinkedList;

    public PilaLinked(List<T> list) {
        this.tLinkedList = new LinkedList<>(list);
    }

    public void push(T elemento) {
        this.tLinkedList.add(elemento);
    }

    public T pop() {
        return this.tLinkedList.removeFirst();
    }

    public T peek() {
        return this.tLinkedList.peek();
    }

    public boolean isEmpty() {
        return tLinkedList.isEmpty();
    }
}
