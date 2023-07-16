package chapter13;

public class Son extends Father {
    private String info = "尚硅谷";

    public void test() {
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
