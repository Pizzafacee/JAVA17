package chapter34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    //泛型方法,这里面的T与类中的T没有关系，可以重名
    public <T> List<T> copyArrayToList(T[] ts) {
        return new ArrayList<>(Arrays.asList(ts));
    }

    public <T> String getValue(T s) {
        return null;
    }
}
