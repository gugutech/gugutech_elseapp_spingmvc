package gugutech.elseapp.model;

import java.math.BigDecimal;
import java.util.Date;

public class BusinessStoreT {
    private Integer storeId;

    private Integer userId;

    private Integer tagId;

    private String photoUrl;

    private String videoRul;

    private String voiceRul;

    private String tagDescription;

    private BigDecimal price;

    private Date createTime;

    private String seg1;

    private String seg2;

    private String seg3;

    private String seg4;

    private String seg5;

    private String seg6;

    private String seg7;

    private String seg8;

    private String seg9;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public String getVideoRul() {
        return videoRul;
    }

    public void setVideoRul(String videoRul) {
        this.videoRul = videoRul == null ? null : videoRul.trim();
    }

    public String getVoiceRul() {
        return voiceRul;
    }

    public void setVoiceRul(String voiceRul) {
        this.voiceRul = voiceRul == null ? null : voiceRul.trim();
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription == null ? null : tagDescription.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public String getSeg7() {
        return seg7;
    }

    public void setSeg7(String seg7) {
        this.seg7 = seg7 == null ? null : seg7.trim();
    }

    public String getSeg8() {
        return seg8;
    }

    public void setSeg8(String seg8) {
        this.seg8 = seg8 == null ? null : seg8.trim();
    }

    public String getSeg9() {
        return seg9;
    }

    public void setSeg9(String seg9) {
        this.seg9 = seg9 == null ? null : seg9.trim();
    }
}