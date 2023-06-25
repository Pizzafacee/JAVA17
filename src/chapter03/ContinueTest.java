package chapter03;

public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 4 == 0) {
                //break;
                continue;
                //不能在break和continue的后面声明语句
                //System.out.println();
            }
            System.out.println(i);
        }
    }
}
