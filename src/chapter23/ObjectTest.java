package chapter23;

public class ObjectTest {
    public static void main(String[] args) {
        new Object(){
            public void test(){
                System.out.println("匿名子类");
            }
        }.test();
    }
}
