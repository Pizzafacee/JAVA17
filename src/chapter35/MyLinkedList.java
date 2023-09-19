package chapter35;

public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    private static class Node<T> {
        private T t;
        private Node<T> before;
        private Node<T> after;

        public Node(T t, Node<T> before, Node<T> after) {
            this.t = t;
            this.before = before;
            this.after = after;
        }
    }

    public MyLinkedList() {
    }

    public boolean add(T t) {
        //创建一个Node对象,作为最后一个元素添加到链表的末尾
        final Node<T> l = last;
        Node<T> newNode = new Node<>(t, l, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.after = newNode;
        }
        size++;
        return true;
    }

    public T get(int index) {
        if (index > size - 1 || index < 0) {
            throw new RuntimeException("超出范围");
        }
        Node<T> result = first;
        for (int i = 0; i < index; i++) {
            result = result.after;
        }
        return result.t;
    }

    public int size() {
        return size;
    }
}
