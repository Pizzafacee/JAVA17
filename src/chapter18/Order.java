package chapter18;

public class Order {
    //属性赋值的顺序
    private int orderId = 1;
    {
        orderId =2;
    }

    public Order(){
        orderId =3;
    }
}
