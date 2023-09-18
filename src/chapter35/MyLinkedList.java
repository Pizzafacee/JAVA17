package chapter35;

public class MyLinkedList<T> {
    private Node<T> node;

    private class Node<T> {
        private T t;
        private Node<T> before;
        private Node<T> after;
    }


}
