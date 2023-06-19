package chapter02;

import org.w3c.dom.ls.LSOutput;

public class ConditionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        String s = "";
        //a > b ? s = "a" : s = "b";
        s = (a > b) ? "a" : "b";

        double d = (a > b) ? 0.1 : 2;
        //获取两个整数 的较大值
        int biggerInt = getBiggerInt(3, 8);
        System.out.println(biggerInt);

        //获取三个整数的最大值
        int biggestInt = getBiggestInt(3, 4, 9);
        System.out.println(biggestInt);

        int weekDayAfter = getWeekDayAfter(4, 10);
        System.out.println(weekDayAfter);

    }

    public static int getBiggerInt(int a, int b) {
        return (a >= b) ? a : b;
        //Math.max(a,b);
    }

    public static int getBiggestInt(int a, int b, int c) {
        //int max;
        // max = (a >= b) ? a : b;
        //return (max >= c) ? max : c;

        return (((a >= b) ? a : b) >= c) ? ((a >= b) ? a : b) : c;
        //Math.max
    }

    public static int getWeekDayAfter(int today, int afterDays) {
        int i = afterDays % 7;
        return today + i;
    }
}
