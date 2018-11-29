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
    final static int ARRAY_SIZE = 100;

    public static void main(String[] args) {
        System.out.println("Lesson 2\n");

        int[] bigArray = new int[ARRAY_SIZE];

        for (int i = 0; i < bigArray.length; i++)
            bigArray[i] = (int) (Math.random() * Integer.MAX_VALUE);

//        for (int i = 0; i < bigArray.length; i++) {
        for (int i = 0; i < 15; i++) {
//            if (bigArray[i] > 2147460000)
                System.out.printf("%8d --- %14d\n",i,bigArray[i]);
        }
        System.out.println("=============================================");

        selectionSort(bigArray);


        for (int i = 0; i < 15; i++) {
            System.out.printf("%8d --- %14d\n",i,bigArray[i]);
        }

        System.out.println("=============================================");

        insertionSort(bigArray);


        for (int i = 0; i < 15; i++) {
            System.out.printf("%8d --- %14d\n",i,bigArray[i]);
        }

    }

    //FIXME
    public static void selectionSort (int[] arr) {
        int min;
        int indexMin;

        for(int i = 0; i < arr.length; i++) {
            min  = arr[i];
            indexMin = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min)
                    indexMin = j;
            }

            if(indexMin != i) {
                min = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = min;
            }
        }
    }


    public static void insertionSort (int[] arr) {
        
        int temp;
        int j;
        
        for (int i = 1; i < arr.length; i++) {

            temp = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }


    }


}
