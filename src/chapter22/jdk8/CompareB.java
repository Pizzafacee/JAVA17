package chapter22.jdk8;

public class CompareB extends SuperClass implements CompareA{
    @Override
    public void method2(String a) {
        CompareA.super.method2(a);
    }

    @Override
    public void method2(int a) {
        CompareA.super.method2(a);
    }


}
