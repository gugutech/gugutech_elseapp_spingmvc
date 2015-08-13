package gugutech.elseapp.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserWithdrawT {
    private Integer withdrawId;

    private Integer userId;

    private String withdrawChannel;

    private BigDecimal withdrawAmount;

    private String withdrawStatus;

    private Date withdrawDatetime;

    private String seg1;

    private String seg2;

    private String seg3;

    private String seg4;

    private String seg5;

    private String seg6;

    public Integer getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(Integer withdrawId) {
        this.withdrawId = withdrawId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWithdrawChannel() {
        return withdrawChannel;
    }

    public void setWithdrawChannel(String withdrawChannel) {
        this.withdrawChannel = withdrawChannel == null ? null : withdrawChannel.trim();
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public String getWithdrawStatus() {
        return withdrawStatus;
    }

    public void setWithdrawStatus(String withdrawStatus) {
        this.withdrawStatus = withdrawStatus == null ? null : withdrawStatus.trim();
    }

    public Date getWithdrawDatetime() {
        return withdrawDatetime;
    }

    public void setWithdrawDatetime(Date withdrawDatetime) {
        this.withdrawDatetime = withdrawDatetime;
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