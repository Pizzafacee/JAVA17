package chapter35;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
        integerMyLinkedList.add(1);
        integerMyLinkedList.add(2);
        integerMyLinkedList.add(3);
        integerMyLinkedList.add(4);
        integerMyLinkedList.add(5);
        integerMyLinkedList.add(6);
        integerMyLinkedList.add(7);
        integerMyLinkedList.add(8);
        System.out.println(integerMyLinkedList.size());
        System.out.println(integerMyLinkedList.get(5));
    }
}
