package gugutech.elseapp.model;

import java.util.Date;

public class UserChargeT {
    private Integer charId;

    private Integer userId;

    private String charChannel;

    private String charAmount;

    private String charStatus;

    private Date charDatetime;

    private Date createTime;

    private String seg1;

    private String seg2;

    private String seg3;

    private String seg4;

    private String seg5;

    private String seg6;

    public Integer getCharId() {
        return charId;
    }

    public void setCharId(Integer charId) {
        this.charId = charId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCharChannel() {
        return charChannel;
    }

    public void setCharChannel(String charChannel) {
        this.charChannel = charChannel == null ? null : charChannel.trim();
    }

    public String getCharAmount() {
        return charAmount;
    }

    public void setCharAmount(String charAmount) {
        this.charAmount = charAmount == null ? null : charAmount.trim();
    }

    public String getCharStatus() {
        return charStatus;
    }

    public void setCharStatus(String charStatus) {
        this.charStatus = charStatus == null ? null : charStatus.trim();
    }

    public Date getCharDatetime() {
        return charDatetime;
    }

    public void setCharDatetime(Date charDatetime) {
        this.charDatetime = charDatetime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSeg1() {
        return seg1;
    }

    public void setSeg1(String seg1) {
        this.seg1 = seg1 == null ? null : seg1.trim();
    }

    public String getSeg2() {
        return seg2;
    }

    public void setSeg2(String seg2) {
        this.seg2 = seg2 == null ? null : seg2.trim();
    }

    public String getSeg3() {
        return seg3;
    }

    public void setSeg3(String seg3) {
        this.seg3 = seg3 == null ? null : seg3.trim();
    }

    public String getSeg4() {
        return seg4;
    }

    public void setSeg4(String seg4) {
        this.seg4 = seg4 == null ? null : seg4.trim();
    }

    public String getSeg5() {
        return seg5;
    }

    public void setSeg5(String seg5) {
        this.seg5 = seg5 == null ? null : seg5.trim();
    }

    public String getSeg6() {
        return seg6;
    }

    public void setSeg6(String seg6) {
        this.seg6 = seg6 == null ? null : seg6.trim();
    }
}