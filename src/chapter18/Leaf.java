package chapter18;

public class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf(){
        super("尚硅谷");
        System.out.println("Leaf的构造器");
    }
}
