package gugutech.elseapp.model;

public class BusinessTagT {
    private Integer tagId;

    private Integer businessMainMenuId;

    private String tagName;

    private String seg1;

    private String seg2;

    private String seg3;

    private String seg4;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getBusinessMainMenuId() {
        return businessMainMenuId;
    }

    public void setBusinessMainMenuId(Integer businessMainMenuId) {
        this.businessMainMenuId = businessMainMenuId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
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
}