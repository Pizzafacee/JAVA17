package chapter03;

import java.util.ArrayList;
import java.util.List;

public class LoopTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("HELLO WORLD");
        }

        int i = 0;
        for (System.out.println("a"); i < 3; System.out.println("b"), i++) {
            System.out.println("c");
        }
        int sum = getSum();
        System.out.println(sum);
        List<Integer> shuiXianHuaNum = getShuiXianHuaNum();
        System.out.println(shuiXianHuaNum);
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //获取所有三位数中的水仙花数
    public static List<Integer> getShuiXianHuaNum() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            //个位数
            int geWei = i % 10;
            //十位
            int shiWei = i / 10 % 10;
            //百位
            int baiWei = i / 100;
            if (i == geWei * geWei * geWei + shiWei * shiWei * shiWei + baiWei * baiWei * baiWei) {
                integers.add(i);
            }
        }
        return integers;
    }

    //求两数最大公约数
    public static int getGreatestCommonDivisor(int a, int b) {
        int min = a >= b ? b : a;
        int greatestCommonDivisor = 0;
        for (int i = min; i > 0; i--) {
            if (i % a == 0 && i% b == 0) {
                greatestCommonDivisor = min;
                break;
            }
        }
        return greatestCommonDivisor;
    }

    //求两数的最小公倍数
    public static int getLeastCommonMultiple(int a, int b) {
        int max = Math.max(a, b);
        int leastCommonMultiple = 0;
        for (int i = max; ; i++) {
            if (i % a == 0 && i % b == 0) {
                leastCommonMultiple = max;
                break;
            }
        }
        return leastCommonMultiple;
    }


}
