package chapter07;

public class RecursionTest03 {
    public static void main(String[] args) {
        RecursionTest03 recursionTest03 = new RecursionTest03();
        int i = recursionTest03.function01(10);
        System.out.println(i);

        int n = recursionTest03.function02(10);
        System.out.println(n);

    }

    //1、已知一个数列，f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值。
    public int function01(int i) {
        if (i == 20) {
            return 1;
        } else if (i == 21) {
            return 4;
        } else {
            return function01(i + 2) - 2 * function01(i + 1);
        }
    }


    //2、已知有一个数列：f(0)=1，f(1)=4, f(n+2)=2*f(n+1)+f(n)，其中n是大于0的整数，求f(10)的值
    public int function02(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * function02(n - 1) + function02(n - 2);
        }
    }

    //3、走台阶问题 假如有10阶楼梯，小朋友每次只能向上走1阶或者2阶，请问一共有多少种不同的走法
    //f(n)=f(n-1)+f(n-2)


    //4、随着数列的增加，斐波那契数列前一个数和后一个数的比值越来越接近黄金分割的数值0.618

}
