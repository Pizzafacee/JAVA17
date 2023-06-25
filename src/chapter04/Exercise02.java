package chapter04;

//使用二维数组打印一个杨辉三角 十行
public class Exercise02 {
    public static void main(String[] args) {
        int[][] ints = new int[10][];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new int[i + 1];
        }

        //先对每一层的头尾赋值1
        for (int i = 0; i < ints.length; i++) {
            ints[i][0] = 1;
            ints[i][ints[i].length - 1] = 1;
        }
        //从第三行开始，每一行的第二个数到倒数第二个数的值为上方两个数之和。
        for (int i = 2; i < ints.length; i++) {
            for (int j = 1; j < ints[i].length - 1; j++) {
                ints[i][j] = ints[i - 1][j - 1] + ints[i - 1][j];
            }
        }

        //遍历输出
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
}
