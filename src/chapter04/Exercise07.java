package chapter04;

/**
 * 数组的扩容与缩容
 * 因为数组一旦初始化，长度就已经固定，所以不能调整数组的空间大小了
 */
public class Exercise07 {
    public static void main(String[] args) {
        //扩容,
        int[] ints = new int[]{2, 3, 6, 9, 12, 15};
        //需要将数组扩容至十个长度
        int[] newInt = new int[10];
        for (int i = 0; i < ints.length; i++) {
            newInt[i] = ints[i];
        }
        ints = newInt;
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        //缩容
        //比如移除索引为4的一个元素
        int[] array = new int[]{35, 6, 8, 11, 23, 14, 16, 12, 1};
        for (int i = 4; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        //元素前移，最后一个变为默认值
        array[array.length - 1] = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        //或者重新创建一个数组，将原数组缩容后的值放进去

    }
}
