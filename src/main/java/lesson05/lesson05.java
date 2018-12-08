package lesson05;

import java.util.Stack;

public class lesson05 {
    public static void main(String[] args) {

        System.out.println(recursiveExponentiation(2, 62));

        Stack<Integer> red = new Stack<>();
        Stack<Integer> geen = new Stack<>();
        Stack<Integer> black = new Stack<>();

        for(int i = 1; i < 9; i++)
            red.push(i);

        hanoiTower(red,geen,black);

    }

    public static void hanoiTower(Stack<Integer> full, Stack<Integer> temp, Stack<Integer> empty) {

        int elementsCount = full.size();

        if(!(empty.size() == elementsCount)) {





        }


    }

    public static long recursiveExponentiation(long number, long degree) {

        long res = 0;

        if(degree > -1) {
            if (degree == 0)
                res = 1;
            else if (degree == 1)
                res = number;
            else
                res = number * recursiveExponentiation(number, degree - 1);

        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return res;
    }
}
