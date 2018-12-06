package lesson04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkIteratorApp {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("11111111");
        list.add("22222222");
        list.add("33333333");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            iterator.remove();

            //iterator.forEachRemaining(); // не понял зачем нужен этот метод

        }

        iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
