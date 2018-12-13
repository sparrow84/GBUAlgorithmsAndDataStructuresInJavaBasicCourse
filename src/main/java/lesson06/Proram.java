package lesson06;

public class Proram {
    public static void main(String[] args) {

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
