package ru.danilsibgatyllin.lesson4;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {

    protected ListMember<E> firstMember;

    protected ListMember<E> currentMember;

    protected ListMember<E> lastMember;

    protected Integer size=0;


    @Override
    public boolean addLast(E e) {
        if(this.firstMember==null){
            this.firstMember=new ListMember<>(null,e,null);
            this.currentMember=this.firstMember;
            this.lastMember=this.firstMember;
            size++;
            return true;
        }
        else{
            ListMember<E> addMember = new ListMember<>(this.lastMember,e,null);
            this.lastMember.nextMember = addMember;
            this.currentMember=this.lastMember=addMember;
            size++;
            return true;
        }
    }

    @Override
    public boolean addFirst(E e) {
        if(this.firstMember==null){
            this.firstMember=new ListMember<>(null,e,null);
            this.currentMember=this.firstMember;
            this.lastMember=this.firstMember;
            size++;
            return true;
        }
        else{
            ListMember<E> addMember = new ListMember<>(null,e,currentMember);
            this.currentMember.prevMember=addMember;
            this.currentMember=this.firstMember=addMember;
            size++;
            return true;
        }
    }


    @Override
    public void removeFromMyList(E e) {
        if(isContains(e)){
            ListMember<E> iterableMember =this.firstMember;
            while (iterableMember!=null){
                if(e.equals(iterableMember.memberValue)) {
                    if(iterableMember==this.firstMember) deleteFirst();
                    else if(iterableMember==this.lastMember) deleteLast();
                    else delete(iterableMember);
                }
                iterableMember=iterableMember.nextMember;
            }
            size--;
        }
    }

    @Override
    public void removeByIndex(int i) {
        removeFromMyList(getItemFromMyListById(i));
    }

    @Override
    public E getItemFromMyListById(int i) {
        int counter =0;
        ListMember<E> iterableMember =this.firstMember;
        while (iterableMember!=null){
            if(counter==i) return iterableMember.memberValue;
            iterableMember=iterableMember.nextMember;
            counter++;
        }
        return null;
    }

    @Override
    public boolean isContains(E e) {
        ListMember<E> iterableMember =this.firstMember;
        while (iterableMember!=null){
            if(e.equals(iterableMember.memberValue)) return true;
            iterableMember=iterableMember.nextMember;
        }
        return false;
    }

    public E getLast(){
        return this.lastMember.memberValue;
    }

    public E getFirst(){
        return this.firstMember.memberValue;
    }

    @Override
    public Integer getSize() {
        return this.size;
    }


    public E deleteFirst(){
        ListMember<E> nextMember = this.firstMember.nextMember;
        this.firstMember.nextMember=null;
        nextMember.prevMember=null;
        this.firstMember=nextMember;
        size--;
        return null;

    }

    public E deleteLast(){
        ListMember<E> prevMember = this.lastMember.prevMember;
        this.lastMember.prevMember.nextMember=null;
        this.lastMember=prevMember;
        size--;
        return null;
    }

    private void delete(ListMember<E> iterableMember){
        ListMember<E> prevIterableMember;
        ListMember<E> nextIterableMember;
        prevIterableMember= iterableMember.prevMember;
        nextIterableMember = iterableMember.nextMember;
        prevIterableMember.nextMember=nextIterableMember;
        nextIterableMember.prevMember=prevIterableMember;
        iterableMember.nextMember=iterableMember.prevMember=null;
        size--;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            ListMember<E> current = firstMember;


            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public E next() {
                ListMember<E> outMember = current;
                current = current.nextMember;
                return outMember.memberValue;
            }


        };
        return iterator;
    }

    @Override
    public Iterator<E> revertIterator() {
        Iterator<E> iterator = new Iterator<E>() {
            ListMember<E> current = lastMember;

            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public E next() {
                ListMember<E> outMember = current;
                current = current.prevMember;
                return outMember.memberValue;
            }
        };
        return iterator;

    }

    private static class ListMember<E> {
        E memberValue;
        ListMember<E> prevMember;
        ListMember<E> nextMember;



        public ListMember( ListMember<E> prevMember, E memberValue, ListMember<E> nextMember) {
            this.memberValue = memberValue;
            this.prevMember = prevMember;
            this.nextMember = nextMember;
        }
    }
}

