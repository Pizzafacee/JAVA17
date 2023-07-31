package chapter26;

import java.util.Scanner;
import java.util.Vector;

public class WrapperTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Object> objects = new Vector<>();
        int maxScore = 0;
        while (true) {
            System.out.println("请输入学生的成绩");
            int i = scanner.nextInt();
            if (i < 0) {
                break;
            }
            objects.addElement(i);
            maxScore = Math.max(maxScore, i);
        }

        for (int i = 0; i < objects.size(); i++) {
            int o = (Integer) objects.get(i);
            int j = o / 10;
            switch (j) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("不及格");
                    break;
                case 6:
                case 7:
                    System.out.println("中等");
                    break;
                case 8:
                    System.out.println("良好");
                    break;
                case 9:
                case 10:
                    System.out.println("优秀");
                    break;
            }
        }
    }
}
