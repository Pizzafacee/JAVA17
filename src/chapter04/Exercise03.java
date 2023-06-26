package chapter04;

//创建一个长度为6的数组，随机数，且不能重复，范围在 1-8之间
public class Exercise03 {
    public static void main(String[] args) {
        int[] ints = new int[6];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 8 + 1);
        }
        //不能重复
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < ints.length - 1; i++) {
                for (int j = i + 1; j < ints.length; j++) {
                    if (ints[j] == ints[i]) {
                        flag = true;
                        ints[j] = (int) (Math.random() * 8 + 1);
                    }
                }
            }
        } while (flag);

        //遍历
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
