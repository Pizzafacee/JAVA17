package chapter07;

import java.io.File;

public class RecursionTest02 {
    public static void main(String[] args) {
        RecursionTest02 recursionTest02 = new RecursionTest02();
        int fibonacciSequence = recursionTest02.fibonacciSequence(7);
        System.out.println(fibonacciSequence);

    }

    //快速排序
    public void quickSort(DataWrapTo[] dataWrapTos, int start, int end) {
        //定义起始和末尾 以及基准值
        if (start < end) {
            int i = start;
            int j = end;
            DataWrapTo base = dataWrapTos[start];
            while (true) {
                while (i < end && base.compareTo(dataWrapTos[++i]) <= 0) ;
                while (j > start && base.compareTo(dataWrapTos[--j]) >= 0) ;
                if (i < j) {
                    swap(dataWrapTos, i, j);
                } else {
                    break;
                }
            }
            swap(dataWrapTos, start, j);
            quickSort(dataWrapTos, start, j - 1);
            quickSort(dataWrapTos, j + 1, end);
        }


    }

    private void swap(DataWrapTo[] dataWrapTos, int i, int j) {
        DataWrapTo temp = dataWrapTos[i];
        dataWrapTos[i] = dataWrapTos[j];
        dataWrapTos[j] = temp;
    }


    //斐波那契数列 1 1 2 3 5 8 13 21 34
    private int fibonacciSequence(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return fibonacciSequence(i - 1) + fibonacciSequence(i - 2);
        }
    }

    //File类的遍历

}
