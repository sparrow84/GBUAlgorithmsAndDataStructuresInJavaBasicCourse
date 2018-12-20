package lesson08;

public class ChainingHashTable<Key, Value> {
    private int M = 97;
    private int size = 0;
    private Object[] st = new Object[M];
    private class Node {
        private Key key;
        private Value value;
        private Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может равняться Null");
        }
        int i = hash(key);
        Node x = (Node) st[i];
        while (x != null) {
            if (key.equals(x.key)) {
                return x.value;
            }
            x = x.next;
        }
        return null;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public void put(Key key, Value value) {
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может равняться Null");
        }

        if (st.length == M)
            enlargeArray();

        int i = hash(key);
        Node x = (Node) st[i];
        while (x != null) {
            if (key.equals(x.key)) {
                x.value = value;
                return;
            }
            x = x.next;
        }
        st[i] = new Node(key, value, (Node) st[i]);
        size++;
    }

    private void enlargeArray() {

        int M = (int) (this.M * 1.5);
        Object[] tmp = new Object[M];
        int size = 0;
        int j;

        mark01:
        for (int i = 0; i < st.length; i++) {

            Key key     = ((Node) st[i]).key;
            Value value = ((Node) st[i]).value;

            if ( key != null) {
                j = hash(key);
                Node x = (Node) tmp[j];
                while (x != null) {
                    if (key.equals(x.key)) {
                        x.value = value;
                        continue mark01;
                    }
                    x = x.next;
                }
                tmp[j] = new Node(key, value, (Node) tmp[j]);
                size++;
            }
        }

        this.M = M;
        st = tmp;
        this.size = size;
    }
}
