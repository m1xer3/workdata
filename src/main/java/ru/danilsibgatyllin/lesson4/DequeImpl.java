package ru.danilsibgatyllin.lesson4;

import java.util.Collection;
import java.util.Iterator;

public class DequeImpl<E> implements Deque<E>{

    protected MyList<E> list ;

    protected boolean isRevertIteration;

    public DequeImpl() {
        this.list = new MyLinkedList<>();
        isRevertIteration=false;
    }

    @Override
    public void changeIterationDirection(){
        if(isRevertIteration){
            isRevertIteration=false;
        } else {
            isRevertIteration=true;
        }
    }

    @Override
    public boolean insertLeft(E value) {
        return list.addFirst(value);
    }

    @Override
    public boolean insertRight(E value) {
        return list.addLast(value);
    }

    @Override
    public E removeLeft() {
        return list.deleteFirst();
    }

    @Override
    public E removeRight() {
        return list.deleteLast();
    }


    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.getSize()==0;
    }

    @Override
    public boolean contains(Object o) {
        return list.isContains((E)o);
    }

    @Override
    public Iterator<E> iterator() {
        if(isRevertIteration){
            return list.revertIterator();
        }
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        Object[] arr =new Object[list.getSize()];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=list.getItemFromMyListById(i);
        }
        return arr;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return list.addLast(e);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
