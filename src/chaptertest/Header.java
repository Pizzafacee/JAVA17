package chaptertest;

import java.util.List;

public class Header {
    private String No;

    private String OrderTypeCode;

    private List<Details> details;

    public void setNo(String No) {
        this.No = No;
    }

    public String getNo() {
        return this.No;
    }

    public void setOrderTypeCode(String OrderTypeCode) {
        this.OrderTypeCode = OrderTypeCode;
    }

    public String getOrderTypeCode() {
        return this.OrderTypeCode;
    }

    public void setDetails(List<Details> details) {
        this.details = details;
    }

    public List<Details> getDetails() {
        return this.details;
    }
}
