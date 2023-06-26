package chapter04;

/**
 * 数组元素的反转
 */
public class Exercise06 {
    public static void main(String[] args) {
        int[] ints = new int[]{2, 6, 8, 9, 10, 12, 11};
        //遍历数组
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+"\t");
        }
        for (int i = 0; i < ints.length / 2 ; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = temp;
        }
        System.out.println();
        //遍历数组
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+"\t");
        }
    }
}
