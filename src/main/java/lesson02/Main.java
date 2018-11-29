/*
+ 1. Создать массив большого размера (миллион элементов).
2. Написать методы:
    + удаления,
    + добавления,
    + поиска
        элемента массива.
+ 3. Заполнить массив случайными числами.
4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
 */

package lesson02;


public class Main {

//    final static int ARRAY_SIZE = 1000000;
    final static int ARRAY_SIZE = 100000;

    public static void main(String[] args) {
        System.out.println("Lesson 2\n");

        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();



        for (int i = 0; i < myArrayList.size(); i++)
            myArrayList.insert((int) (Math.random() * Integer.MAX_VALUE));





        long sec = System.currentTimeMillis() / 1000;
        System.out.println("==== selectionSort =========================================");
        myArrayList.selectionSort();
        System.out.println("==== selectionSort === time wasted (sec) - " + ((System.currentTimeMillis() / 1000) - sec) + "  ==================");

        for (int i = 0; i < 15; i++)
            System.out.printf("%8d --- %14d\n",i,myArrayList.get(i));


        sec = System.currentTimeMillis() / 1000;
        System.out.println("==== insertionSort =========================================");
        myArrayList.insertionSort();
        System.out.println("==== insertionSort === time wasted (sec) - " + ((System.currentTimeMillis() / 1000) - sec) + "  ==================");

        for (int i = 0; i < 15; i++)
            System.out.printf("%8d --- %14d\n",i,myArrayList.get(i));


    }

}
