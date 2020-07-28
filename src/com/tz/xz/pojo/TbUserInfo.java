package com.tz.xz.pojo;

public class TbUserInfo {
    private Integer sId;

    private String sName;

    private String sPwd;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPwd() {
        return sPwd;
    }

    public void setsPwd(String sPwd) {
        this.sPwd = sPwd == null ? null : sPwd.trim();
    }
}