package chaptertest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Date;

public class Order {
    private String orderTypeID;
    private String no;
    private int rowNo;
    private String sapCode;
    private long shipQty;
    private Date shipDate;

    public Order(String orderTypeID, String no, int rowNo, String sapCode, long shipQty, Date shipDate) {
        this.orderTypeID = orderTypeID;
        this.no = no;
        this.rowNo = rowNo;
        this.sapCode = sapCode;
        this.shipQty = shipQty;
        this.shipDate = shipDate;
    }

    public String getOrderTypeID() {
        return orderTypeID;
    }

    public void setOrderTypeID(String orderTypeID) {
        this.orderTypeID = orderTypeID;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public String getSapCode() {
        return sapCode;
    }

    public void setSapCode(String sapCode) {
        this.sapCode = sapCode;
    }

    public long getShipQty() {
        return shipQty;
    }

    public void setShipQty(long shipQty) {
        this.shipQty = shipQty;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }
}

class Test{
    public static void main(String[] args) {
        Order order = new Order("11111", "2222", 333, "332323", 2345, new Date());
        String s = JSONObject.toJSONString(order);
        System.out.println(s);
    }
}
