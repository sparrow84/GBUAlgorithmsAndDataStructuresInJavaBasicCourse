package lesson05;

import java.util.Stack;

public class lesson05 {
    public static void main(String[] args) {

        double number = 5;
        int degree = -2;

        System.out.println(recursiveExponentiation(number, degree));
        System.out.println(cyclicExponentiation(number,degree));


        Stack<Integer> red = new Stack<>();
        Stack<Integer> green = new Stack<>();
        Stack<Integer> black = new Stack<>();

        int elementsCount = 8;

        for(int i = elementsCount; i > 0; i--)
            red.push(i);

//        hanoiTowerR(elementsCount, red,green,black);

    }

    public static void hanoiTowerC(int elementsCount, Stack<Integer> from, Stack<Integer> to, Stack<Integer> temp) {

    }

    public static void hanoiTowerR(int elementsCount, Stack<Integer> from, Stack<Integer> to, Stack<Integer> temp) {
        if(elementsCount > 0) {
            hanoiTowerR(elementsCount - 1, from, temp, to);
            to.push(from.pop());

            System.out.println("\n\n\n\n\n");
            System.out.println(from);
            System.out.println(to);
            System.out.println(temp);

            hanoiTowerR(elementsCount -1, temp, to, from);
        }
    }

    public static double recursiveExponentiation(double number, int degree) {
        double res = 0;

        if (degree == 0)
            res = 1;
        else
            res = number * recursiveExponentiation(number, Math.abs(degree) - 1);

        if (degree < 0)
            res = 1 / res;

        return res;
    }

    public static double cyclicExponentiation(double number, int degree) {
        double res = number;

        if(Math.abs(degree) == 0)
            res = 1;
        else
            for (int i = 1; i < Math.abs(degree); i++)
                res = res * number;

        if(degree < 0)
            res = 1 / res;

        return res;
    }
}
