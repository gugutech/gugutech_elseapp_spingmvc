package gugutech.elseapp.model;

public class UserLoginT {
    private Integer loginId;

    private Integer userId;

    private String userLoginPwd;

    private String connectionId;

    private String connectionPw;

    private String uuid;

    private String activeFlag;

    private String seg1;

    private String seg2;

    private String seg3;

    private String seg4;

    private String seg5;

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserLoginPwd() {
        return userLoginPwd;
    }

    public void setUserLoginPwd(String userLoginPwd) {
        this.userLoginPwd = userLoginPwd == null ? null : userLoginPwd.trim();
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId == null ? null : connectionId.trim();
    }

    public String getConnectionPw() {
        return connectionPw;
    }

    public void setConnectionPw(String connectionPw) {
        this.connectionPw = connectionPw == null ? null : connectionPw.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag == null ? null : activeFlag.trim();
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
}