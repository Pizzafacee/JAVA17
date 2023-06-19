package chapter02;


//运算符
public class OperatorTest {
    public static void main(String[] args) {
        int i = 3;
        int j = 3;
        int i1 = 16;
        double i2 = (double) i1 / i;
        System.out.println(i2);
        //int i3 = i1 % i;
        //System.out.println(i3);
        System.out.println(-i1 % i);
        //前加加 后加加
        int i4 = i++;
        int i5 = ++j;
        System.out.println("i=" + i + "\ti4=" + i4);
        System.out.println("j=" + j + "\ti5=" + i5);
        int[] threePart = getThreePart(36525451);
        int[] threePart2 = getThreePart2(36525451);
        for (int i3 : threePart) {
            System.out.println(i3);
        }
        for (int i3 : threePart2) {
            System.out.println(i3);
        }

        String dayAndHour = getDayAndHour(19);
        System.out.println(dayAndHour);

        int ij = 3;
        ij = ij++;
        System.out.println(ij);

        int i8 = 18;
        i8 %= 4;
        System.out.println(i8);
        i8 += 2;
        i8 /= 3;
        i8 *= 4;
        i8 -= 8;
    }

    //取得个位 十位 或百位
    public static int[] getThreePart(int num) {
        //先取个位
        int geWei = num % 10;
        int shiWei;
        int baiWei;
        //再取十位
        if (num / 10 > 1) {
            shiWei = num / 10 % 10;
        } else {
            return new int[]{geWei};
        }
        //取百位
        if (num / 100 > 1) {
            baiWei = num / 100 % 10;
        } else {
            return new int[]{geWei, shiWei};
        }
        return new int[]{geWei, shiWei, baiWei};
    }

    public static int[] getThreePart2(int num) {
        int geWei = num % 10;
        int shiWei;
        int baiWei;
        int i = num / 10;
        int j = num / 100;
        if (i > 0) {
            shiWei = i % 10;
        } else {
            return new int[]{geWei};
        }
        if (j > 0) {
            baiWei = j % 10;
        } else {
            return new int[]{geWei, shiWei};
        }
        return new int[]{geWei, shiWei, baiWei};
    }

    public static String getDayAndHour(int hour) {
        //多少个小时
        int hourOfDay = hour % 24;
        //多少天
        int day = hour / 24;

        if (day > 0) {
            return "共计" + day + "天" + hourOfDay + "小时";
        }
        return "共计" + hourOfDay + "小时";
    }

}
