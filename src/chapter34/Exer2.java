package chapter34;

public class Exer2 {
    public static <T> void exchange(T[] ts, int a, int b) {
        T temp = ts[a];
        ts[a] = ts[b];
        ts[b] = temp;
    }
}
