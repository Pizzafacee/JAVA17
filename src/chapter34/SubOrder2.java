package chapter34;
//不是泛型类
public class SubOrder2 extends Order<Integer> {
    private Integer orderNo;

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
}
