package chapter07;

public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest overLoadTest = new OverLoadTest();
        String s = overLoadTest.joinString("zhe", "shi", "yi", "ge", "ji", "dan");
        System.out.println(s);
    }

    public void add(int... ints) {
        //int anInt = ints[0];
    }

    public void add(int a ,int b){}
    

    public String joinString(String... strings) {
        String string = "";
        for (int i = 0; i < strings.length; i++) {
            if (i == 0) {
                string += strings[0];
            } else {
                string += ("-" + strings[i]);
            }
        }
        return string;

    }
}
