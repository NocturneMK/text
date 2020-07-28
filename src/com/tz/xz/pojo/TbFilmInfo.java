package com.tz.xz.pojo;

public class TbFilmInfo {
    private Integer id;

    private String fName;

    private String fType;

    private Integer fScore;

    private Integer fPlayYear;

    private String fOrigin;

    private String fPic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType == null ? null : fType.trim();
    }

    public Integer getfScore() {
        return fScore;
    }

    public void setfScore(Integer fScore) {
        this.fScore = fScore;
    }

    public Integer getfPlayYear() {
        return fPlayYear;
    }

    public void setfPlayYear(Integer fPlayYear) {
        this.fPlayYear = fPlayYear;
    }

    public String getfOrigin() {
        return fOrigin;
    }

    public void setfOrigin(String fOrigin) {
        this.fOrigin = fOrigin == null ? null : fOrigin.trim();
    }

    public String getfPic() {
        return fPic;
    }

    public void setfPic(String fPic) {
        this.fPic = fPic == null ? null : fPic.trim();
    }
}