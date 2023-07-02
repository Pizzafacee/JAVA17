package chapter07;

public class DataWrapTo implements Comparable<DataWrapTo> {
    int data;
    String flag;

    public DataWrapTo() {
    }

    public DataWrapTo(int data, String flag) {
        this.data = data;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return data + flag;
    }

    @Override
    public int compareTo(DataWrapTo o) {
        return this.data > o.data ? 1 : (this.data == o.data ? 0 : -1);
    }
}
