package chapter07;

import java.util.Arrays;

//按条件排序(升序降序)，并进一步体会java中的值传递
public class SortCondition {
    public static void main(String[] args) {
        int[] ints = new int[]{3, 8, 66, 25, 11, 45, 98, 22, 45, 33, 18, 6, 5, 3};
        SortCondition sortCondition = new SortCondition();
        sortCondition.sort(ints, "desc");
        System.out.println(Arrays.toString(ints));
    }

    public void sort(int[] ints, String condition) {
        if ("asc".equals(condition)) {
            //升序排序
            for (int i = 0; i < ints.length - 1; i++) {
                for (int j = 0; j < ints.length - 1 - i; j++) {
                    if (ints[j] > ints[j + 1]) {
                        //swap(ints[j], ints[j + 1]);//这种交换没有用
                        swap(ints,j,j+1);
                    }
                }
            }
            //降序排序
        } else if ("desc".equals(condition)) {
            for (int i = 0; i < ints.length - 1; i++) {
                for (int j = 0; j < ints.length - 1 - i; j++) {
                    if (ints[j] < ints[j + 1]) {
                        //swap(ints[j], ints[j + 1]);//这种交换没有用
                        swap(ints,j,j+1);
                    }
                }
            }
        } else {
            System.out.println("你输入的参数有误");
        }
    }

    //定义一个交换两个数的方法
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    //定义另一个交换两个数的方法
    public void swap(int[] ints, int i,int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }
}
