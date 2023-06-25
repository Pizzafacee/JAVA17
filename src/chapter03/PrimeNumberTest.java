package chapter03;

import java.util.ArrayList;
import java.util.List;

//找出100以内的质数，10000以内的呢？
public class PrimeNumberTest {
    public static void main(String[] args) {

        //boolean prime = isPrime(9);
        long start = System.currentTimeMillis();
        List<Integer> prime = getPrime();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(prime);

    }

    //判断一个数是否是质数
    public static boolean isPrime(int a) {
        if (a == 1 || a == 2) {
            return true;
        }
        //boolean isPrime = true;
        //for (int i = 2; i <= a - 1; i++) {
        //不需要除到最后，只需要除到开根号
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }


    //找出100以内的所有质数
    public static List<Integer> getPrime() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
