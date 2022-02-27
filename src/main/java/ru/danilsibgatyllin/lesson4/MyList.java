package ru.danilsibgatyllin.lesson4;

import java.util.Iterator;

public interface MyList<E> extends Iterable<E>{

    boolean addLast(E e);

    boolean addFirst(E e);

    void removeFromMyList(E e);

    void removeByIndex(int i);

    E getItemFromMyListById(int i);

    boolean isContains(E e);

    E deleteFirst();

    E deleteLast();

    E getLast();

    E getFirst();

    Integer getSize();

    Iterator<E> revertIterator();

}
