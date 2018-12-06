package lesson04;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);

        /*Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            Integer current = iter.next();
            System.out.println(current);
        }*/

        for (Integer current:
                list) {
            System.out.println(current);
        }
    }
}
