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

    public int indexOf(T t) {
        int index = 0;
        if (t == null) {
            for (Node<T> node = first; node != null; node = node.after) {
                if (node.t == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<T> node = first; node != null; node = node.after) {
                if (t.equals(node.t)) {
                    return index;
                }
                index++;
            }
        }

        return -1;
    }

    //根据索引删除一个元素
    public T remove(int index) {
        Node<T> node = node(index);
        Node<T> after = node.after;
        Node<T> before = node.before;
        if (before == null) {

        }


    }

    //根据索引获得一个node
    private Node<T> node(int index) {
        Node<T> result;
        if (index < size >> 1) {
            result = first;
            for (int i = 0; i < index; i++) {
                result = result.after;
            }
        } else {
            result = last;
            for (int i = size; i > index; i--) {
                result = result.before;
            }
        }
        return result;
    }
}
