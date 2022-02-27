package ru.danilsibgatyllin.lesson4;

public class AppStart {

    public static void main(String[] args) {

//        MyList<Integer> linkedList = new MyLinkedList<>();
//
//        linkedList.addLast(17);
//        linkedList.addLast(12);
//        linkedList.addLast(17);
//        linkedList.addLast(13);
//        linkedList.addLast(17);
//        linkedList.addLast(14);
//        linkedList.addLast(15);
//        linkedList.addLast(16);
//        linkedList.addLast(14);
//        linkedList.addLast(99);
//
//        for (Integer o : linkedList) {
//            System.out.println("Element "+o);
//        }
//
//        linkedList.removeByIndex(0);
//        System.out.println("----------------");
//        for (Integer o : linkedList) {
//            System.out.println("Element "+o);
//        }

        Deque<Integer> deq = new DequeImpl<>();

        deq.insertLeft(12);
        deq.insertLeft(123);
        deq.insertLeft(31);
        deq.insertLeft(16);
        deq.insertLeft(99);
        deq.insertRight(1);
        deq.insertRight(55);


        for (Integer integer : deq) {
            System.out.println(integer);
        }

        System.out.println("----------------");

        deq.changeIterationDirection();

        for (Integer integer : deq) {
            System.out.println(integer);
        }

        deq.removeLeft();

        deq.removeRight();
        deq.removeRight();

        System.out.println("----------------");

        for (Integer integer : deq) {
            System.out.println(integer);
        }



    }
}
