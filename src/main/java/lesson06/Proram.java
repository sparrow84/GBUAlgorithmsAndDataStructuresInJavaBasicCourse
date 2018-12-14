package lesson06;

import lesson06.MyBST.MyBST;

import java.util.ArrayList;
import java.util.List;

public class Proram {
    public static void main(String[] args) {

        List<MyBST<Integer,Integer>> myBST = new ArrayList<>();

        int treeCount = 20;
        int treeHeight = 6;
        int randMin = -100;
        int randMax = 100;

        for (int i = 0; i < treeCount; i++) {
            myBST.add(i, new MyBST<>());
            while (myBST.get(i).height() < treeHeight)
                myBST.get(i).put(getRandomNumber(randMin,randMax),getRandomNumber(randMin,randMax));
        }
    }

/*
    public static void main(String[] args) {
        BST<Character, Integer> assArr = new BST<>();
        assArr.put('S', 123);
        assArr.put('E', 345);
        assArr.put('A', 123);
        assArr.put('C', 987);
        assArr.put('R', 911);
        assArr.put('H', 112);
        assArr.put('M', 012);
        assArr.put('X', 003);
        System.out.println();
    }
*/

    private static int getRandomNumber(int a, int b) {
        if (b < a)
            return getRandomNumber(b, a);
        return a + (int) ((1 + b - a) * Math.random());
    }
}
