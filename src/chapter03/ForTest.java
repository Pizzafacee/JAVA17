package chapter03;

public class ForTest {
    public static void main(String[] args) {
        //打印菱形
        /**
         * 层数  -  *
         * 1    8   1  2i+j=10  2i-k=1  1  2 7  2i+k=9
         * 2    6   3                   2  4 5
         * 3    4   5                   3  6 3
         * 4    2   7                   4  8 1
         * 5    1   9
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= (10 - 2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (9 - 2 * i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        printMultiTable();
    }

    //打印乘法表
    public static void printMultiTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i+" ");
            }
            System.out.println();
        }
    }
}
