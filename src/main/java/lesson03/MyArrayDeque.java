package lesson03;

/*
InsertLeft
InserRight
RemoveLeft
RemoveRight
 */

public class MyArrayDeque<Item> {

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
    private boolean isEmpty() {
        return size == 0;
    }

    public void insertLeft () {
        //
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
