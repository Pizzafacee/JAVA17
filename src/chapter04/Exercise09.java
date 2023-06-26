package chapter04;

/**
 * 数组排序
 * 1、冒泡排序
 * 2、快速排序
 * 3、堆排序
 */
public class Exercise09 {
    public static void main(String[] args) {
        int[] ints = new int[]{10, 3, 12, 5, 36, 42, 21, 13, 16, 9, 14, 6};
        int[] ints1 = bubbleSort(ints);
        int[] ints2 = bubbleSort2(ints);
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < ints2.length; i++) {
            System.out.print(ints2[i]+"\t");
        }
    }

    //冒泡排序
    public static int[] bubbleSort(int[] ints) {
        for (int i = ints.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        return ints;
    }

    //冒泡排序2
    public static int[] bubbleSort2(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        return ints;
    }

    //快速排序

}
