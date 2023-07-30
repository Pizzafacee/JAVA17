package chapter22.jdk8;


public interface CompareA {
    //jdk8中接口中可以有静态方法
    public static void method1() {
        System.out.println("静态方法 ");
    }

    //默认方法
    public default void method2(String a) {
    }

    public default void method2(int a) {
    }

    public default void method3(){}
}
