package chapter35;

public class MyArrayList<T> {
    private Object[] element;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.element = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("容量不能小于0");
        }
        this.element = new Object[capacity];
    }

    //添加元素
    public boolean add(T t) {
        //判断此时的容量够不够，不够需要扩容
        if (isEnoughCapacity()) {
            //扩容
            growth();
        }
        element[size] = t;
        size++;
        return true;
    }

    //删除元素
    public T remove(int index) {
        if (index > size) {
            return null;
        }
        T t = (T) element[index];
        for (int i = index; i < size; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return t;
    }

    //获取元素
    public T get(int index) {
        if (index > element.length) {
            throw new RuntimeException("超出范围");
        }
        return (T) element[index];
    }

    //获取元素个数
    public int size() {
        return size;
    }


    //判断容量
    private boolean isEnoughCapacity() {
        return size == element.length;
    }

    //扩容
    private boolean growth() {
        Object[] objects;
        if (size < 10) {
            objects = new Object[size + DEFAULT_CAPACITY];
        } else {
            objects = new Object[size * 2];
        }
        return copyArray(objects);
    }

    //复制
    private boolean copyArray(Object[] newObjects) {
        for (int i = 0; i < element.length - 1; i++) {
            newObjects[i] = element[i];
        }
        this.element = newObjects;
        return true;
    }
}
