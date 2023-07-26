package chapter18;

public class Test02 {
    public static void main(String[] args) {
        Sub sub = new Sub();
    }

}

class Base {
    Base() {
        method(100);
    }

    {
        System.out.println("base");
    }

    public void method(int i) {
        System.out.println("base: " + i);
    }
}

class Sub extends Base {
    Sub() {
        super.method(70);
    }

    {
        System.out.println("sub");
    }

    public void method(int j) {
        System.out.println("sub : " + j);
    }
}
