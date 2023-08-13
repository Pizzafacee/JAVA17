package chapter29;

public class StringTest03 {
    public static void main(String[] args) {
        String abdcdfeghkikjlmnopl = StringTest03.reverseString("abdcdfeghkikjlmnopl", 3, 8);
        String s = StringTest03.removeBlank("  sssssswww    ");
        int times = StringTest03.times("ab", "wwwwabwwjsabwwwwabjjssabsswabss");
        int times1 = StringTest03.times("ab", "asdfsscsgw");
        System.out.println(s);
        System.out.println(abdcdfeghkikjlmnopl);
        System.out.println(times);
        System.out.println(times1);
    }

    //将字符串指定部分反转
    public static String reverseString(String str, int start, int end) {
        char[] chars = str.toCharArray();
        for (int i = start; i <= (end - start) / 2 + start; i++) {
            char temp = chars[i];
            chars[i] = chars[start + end - i];
            chars[start + end - i] = temp;
        }
        return String.valueOf(chars);
    }

    //去除字符串的头尾空格
    public static String removeBlank(String string) {
        int start = 0;
        int end = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = string.length() - 1; i > 0; i--) {
            if (string.charAt(i) != ' ') {
                end = i;
                break;
            }
        }
        return string.substring(start, end + 1);

    }


    //找出b字符串中包含多少个a字符串
    public static int times(String a, String b) {
        if (b.contains(a)) {
            String substring = b.substring(b.indexOf(a) + a.length());
            int times = times(a, substring);
            return ++times;
        } else {
            return 0;
        }
    }
}
