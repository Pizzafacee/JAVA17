package chapter34;

public class SubOrder5<T, E> extends Order<T> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
