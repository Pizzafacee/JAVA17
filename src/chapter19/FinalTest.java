package chapter19;

public class FinalTest {
    //final修饰的成员变量只能显示赋值、代码块赋值、构造器赋值
    private final int age = 10;

//    {
//        age = 10;
//    }

//    public FinalTest() {
//        age = 20;
//    }


    public FinalTest() {
    }

//    public FinalTest(int age) {
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }
}
