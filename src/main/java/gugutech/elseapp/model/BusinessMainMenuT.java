package gugutech.elseapp.model;

public class BusinessMainMenuT {
    private Integer businessMainMenuId;

    private String businessTitle;

    private String businessContent;

    private String businessBackgroundUrl;

    private String businessPriority;

    private String businessTypeName;

    public Integer getBusinessMainMenuId() {
        return businessMainMenuId;
    }

    public void setBusinessMainMenuId(Integer businessMainMenuId) {
        this.businessMainMenuId = businessMainMenuId;
    }

    public String getBusinessTitle() {
        return businessTitle;
    }

    public void setBusinessTitle(String businessTitle) {
        this.businessTitle = businessTitle == null ? null : businessTitle.trim();
    }

    public String getBusinessContent() {
        return businessContent;
    }

    public void setBusinessContent(String businessContent) {
        this.businessContent = businessContent == null ? null : businessContent.trim();
    }

    public String getBusinessBackgroundUrl() {
        return businessBackgroundUrl;
    }

    public void setBusinessBackgroundUrl(String businessBackgroundUrl) {
        this.businessBackgroundUrl = businessBackgroundUrl == null ? null : businessBackgroundUrl.trim();
    }

    public String getBusinessPriority() {
        return businessPriority;
    }

    public void setBusinessPriority(String businessPriority) {
        this.businessPriority = businessPriority == null ? null : businessPriority.trim();
    }

    public String getBusinessTypeName() {
        return businessTypeName;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName == null ? null : businessTypeName.trim();
    }
}