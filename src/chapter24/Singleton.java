package chapter24;
//用枚举实现单列模式
public enum Singleton {
    SINGLETON;
}

class Singleton2 {
    private Singleton2() {
    }

    public static final Singleton2 singleton2 = new Singleton2();
}
