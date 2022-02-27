package ru.danilsibgatyllin.lesson4;

import java.util.Iterator;
import java.util.Queue;

public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
    void changeIterationDirection();

}
