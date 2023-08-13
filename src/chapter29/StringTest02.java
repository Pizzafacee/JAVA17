package chapter29;

public class StringTest02 {
    String str = "good";
    char[] chars = {'t', 'e', 's', 't'};

    public void change(String str, char[] chars) {
        str = "bye";
        chars[0] = 'b';
    }

    public void change2(String str, char[] chars) {
        str = "bye";
        chars = new char[]{'b'};
    }

    public static void main(String[] args) {
        StringTest02 stringTest02 = new StringTest02();
        stringTest02.change(stringTest02.str, stringTest02.chars);
        stringTest02.change2(stringTest02.str, stringTest02.chars);
        System.out.println(stringTest02.str);
        for (int i = 0; i < stringTest02.chars.length; i++) {
            System.out.println(stringTest02.chars[i]);
        }
    }
}
