package chapter04;

/**
 * 数组值得赋值与复制
 */
public class Exercise05 {
    public static void main(String[] args) {
        //定义一个数组
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] ints1 = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ints[i];
        }
    }
}
