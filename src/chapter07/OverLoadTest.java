package chapter07;

//方法重载
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest overLoadTest = new OverLoadTest();
        String s = overLoadTest.joinString("zhe", "shi", "yi", "ge", "ji", "dan");
        System.out.println(s);
    }

    public void add(int... ints) {
        //int anInt = ints[0];
    }

    public void add(double a, int b) {
    }
    //public void add(int[] ints){} 数组类型的形参与可变参数在编译时被认为是一种东西，不构成重载

    public void add(int a, double b) {
    }

    public void add(int a, int b) {
    }

    public String add(int a, long b) {
        return "";
    }

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
