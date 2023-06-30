package chapter07;

//递归
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest recursionTest = new RecursionTest();
        int sum = recursionTest.sum(100);
        System.out.println(sum);

        long factorial = recursionTest.factorial(10);
        System.out.println(factorial);
    }

    //计算1-100的数和
    public int sum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return sum(i - 1) + i;
        }
    }

    //计算n!
    public long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
    //快速排序


    //汉诺塔游戏


    //斐波那契数列  1 1 2 3 5 8 13 21 34 55

}
