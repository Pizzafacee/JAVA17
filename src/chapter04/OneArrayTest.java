package chapter04;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OneArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[2];
        byte[] bytes = new byte[2];
        short[] shorts = new short[2];
        char[] chars = new char[2];
        String[] strings = new String[3];
        int[] ints1 = {1, 2};
        ints[0] = 1;
        bytes[0] = 2;
        shorts[0] = 3;
        chars[0] = 'a';
        System.out.println("int" + ints[0]);
        System.out.println("bytes" + bytes[0]);
        System.out.println("shorts" + shorts[0]);
        System.out.println("chars" + chars[0]);
        System.out.println("Strings" + strings[0]);
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(uuid);
        //printWeekDay();
        scoreGrade();
    }


    //从键盘输入1-7，要求显示对应的星期几。
    public static void printWeekDay() {
        String[] weekDays = {"Monday", "TuesDay", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < 1 || i > 7) {
            System.out.println("输入的数字不符合要求");
        } else {
            System.out.println("选择了" + weekDays[i - 1]);
        }
        scanner.close();


    }

    //从键盘输入学生的成绩，找出最高分，并按要求划分分数等级
    public static void scoreGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5位学生的成绩");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int forth = scanner.nextInt();
        int fifth = scanner.nextInt();
        int[] scores = {first, second, third, forth, fifth};
        OptionalInt maxOptional = Arrays.stream(scores).max();
        int max = maxOptional.getAsInt();
        System.out.println("最高分是" + max);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " Grade is " + divideGrade(scores[i], max));
        }
        scanner.close();
    }

    //划分等级的方法
    public static String divideGrade(int score, int max) {
        if (score >= max - 10) {
            return "A";
        } else if (score >= max - 20) {
            return "B";
        } else if (score >= max - 30) {
            return "C";
        } else {
            return "D";
        }
    }
}
