package lesson03;

/*
InsertLeft
InserRight
RemoveLeft
RemoveRight
 */

public class MyArrayDeque<Item> {

    private static final int SIZE_INCREASE_RATIO = 2;

    private Object[] queue;

    private int start;

    private int end;

    private int size;

    public MyArrayDeque() {
        start = 0;
        end = 0;
        size = 0;
        queue = new Object[1];
    }

    // метод возвращает размер очереди
    public int getSize() {
        return size;
    }

    // метод проверяет очередь на заполненность
    public boolean isEmpty() {
        return size == 0;
    }

    public void resize () {
        Object[] temp = new Object[size * SIZE_INCREASE_RATIO];


        for (int i = 0; i < size; i++) {
            temp[i] = queue[(start + i) % size];
        }



        queue = temp;
        start = 0;
        end = size;
    }

    public void resize1 (int capacity) {

        Object[] temp = new Object[capacity];

        for (int i = 0; i < size; i++)
            temp[i] = queue[(start + i) % size];

        queue = temp;
        start = 0;
        end = size;
    }

    public void insertLeft (Item item) {
        if (queue.length == size)
            resize();

        if (start > 0)
            start--;
        else
            start = queue.length - 1;

        queue[start] = item;
        size++;


        //FIXME
        if ()



    }

    public void inserRight () {
        //
    }

    public void removeLeft () {
        //
    }

    public void removeRight () {
        //
    }

//    public void  () {}




















}
