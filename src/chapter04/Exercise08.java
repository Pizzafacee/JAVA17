package chapter04;

/**
 * 元素的查找
 * 1、线性查找
 * 2、二分查找
 */
public class Exercise08 {
    public static void main(String[] args) {
        int[] ints = new int[]{2, 5, 9, 41, 12, 16, 33};
        //查找元素等于12，如找不到，返回提示信息；
        boolean flag = true;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 12) {
                flag = false;
                System.out.println("该元素所在索引是" + i);
                break;
            }
        }
        if (flag) {
            System.out.println("该数组中不存在此元素");
        }

        binarySearch();
    }

    //二分查找，前提是数组是有序的
    public static void binarySearch() {
        int[] ints = {1, 5, 6, 9, 13, 22, 26, 28, 50, 55, 56, 60};
        int target = 22;
        //定义头和尾
        int head = 0;
        int end = ints.length - 1;
        boolean flag = true;
        while (head <= end) {
            int mid = (head + end) / 2;
            if (ints[mid] == target) {
                flag = false;
                System.out.println("索引是" + mid);
                break;
            } else if (target > ints[mid]) {
                head = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (flag) {
            System.out.println("没有该元素");
        }
    }
}
