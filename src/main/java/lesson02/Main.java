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

//        int[] bigArray = new int[ARRAY_SIZE];
        int[] bigArray = {7,1,13,3,12,5,6,0,8,9,10,4,11,2,14};

//        for (int i = 0; i < bigArray.length; i++)
//            bigArray[i] = (int) (Math.random() * Integer.MAX_VALUE);

//        for (int i = 0; i < bigArray.length; i++) {

        System.out.println("==== showArray =========================================");
        for (int i = 0; i < 15; i++) {
//            if (bigArray[i] > 2147460000)
                System.out.printf("%8d --- %14d\n",i,bigArray[i]);
        }


        long sec = System.currentTimeMillis() / 1000;
        System.out.println("==== selectionSort =========================================");
        myArrayList.selectionSort();
        System.out.println("==== selectionSort === time wasted (sec) - " + ((System.currentTimeMillis() / 1000) - sec) + "  ==================");

        for (int i = 0; i < 15; i++)
            System.out.printf("%8d --- %14d\n",i,bigArray[i]);


        sec = System.currentTimeMillis() / 1000;
        System.out.println("==== insertionSort =========================================");
        myArrayList.insertionSort();
        System.out.println("==== insertionSort === time wasted (sec) - " + ((System.currentTimeMillis() / 1000) - sec) + "  ==================");

        for (int i = 0; i < 15; i++)
            System.out.printf("%8d --- %14d\n",i,bigArray[i]);


    }

}
