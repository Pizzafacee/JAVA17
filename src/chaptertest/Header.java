package chaptertest;


import java.util.List;

public class Header {
    private String warehouseId;

    private String soReference1;

    private String soReference4;

    private String orderType;

    private String orderTime;

    private String hedi03;

    private String hedi04;

    private String flag;

    private String carrierAddress3;

    private String consigneeAddress1;

    private String channel;

    private List<Details> details;

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseId() {
        return this.warehouseId;
    }

    public void setSoReference1(String soReference1) {
        this.soReference1 = soReference1;
    }

    public String getSoReference1() {
        return this.soReference1;
    }

    public void setSoReference4(String soReference4) {
        this.soReference4 = soReference4;
    }

    public String getSoReference4() {
        return this.soReference4;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTime() {
        return this.orderTime;
    }

    public void setHedi03(String hedi03) {
        this.hedi03 = hedi03;
    }

    public String getHedi03() {
        return this.hedi03;
    }

    public void setHedi04(String hedi04) {
        this.hedi04 = hedi04;
    }

    public String getHedi04() {
        return this.hedi04;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setCarrierAddress3(String carrierAddress3) {
        this.carrierAddress3 = carrierAddress3;
    }

    public String getCarrierAddress3() {
        return this.carrierAddress3;
    }

    public void setConsigneeAddress1(String consigneeAddress1) {
        this.consigneeAddress1 = consigneeAddress1;
    }

    public String getConsigneeAddress1() {
        return this.consigneeAddress1;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setDetails(List<Details> details) {
        this.details = details;
    }

    public List<Details> getDetails() {
        return this.details;
    }
}
