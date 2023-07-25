package chapter18;

public class Order {
    static int x;

    static {
        x = 3;
        x--;
    }

    {
        orderId = 2;
    }

    //属性赋值的顺序
    int orderId = 1;


    public Order(){orderId =3;}
}
