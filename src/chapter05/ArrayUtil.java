package chapter05;

import java.util.Arrays;

public class ArrayUtil{
    public static void main(String[] args) {
        //比较俩个数组的内容
        boolean equals = Arrays.equals(new int[2], new int[3]);
        //把数组内容拼接以字符串输出
        String s = Arrays.toString(new int[3]);
        //将数组中的元素以指定内容全部替换
        Arrays.fill(new int[3],10);
        //数组内容进行排序 快速排序
        Arrays.sort(new int[3]);
        //二分查找，注意，当前数组必须是有序的,如果找到了，就返回索引，如果没找到，会返回一个负数
        int i = Arrays.binarySearch(new int[3], 3);

        //数组下标越界异常
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();

        //空指针异常
        NullPointerException nullPointerException = new NullPointerException();
    }
}
