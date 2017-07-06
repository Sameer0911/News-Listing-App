package com.example.android.quakereport.Models;

public class News {

    private String type;
    private String sectionName;
    private String webTitle;
    private String webURL;

    public News(String type, String webTitle, String sectionName, String webURL) {
        this.type = type;
        this.webTitle = webTitle;
        this.sectionName = sectionName;
        this.webURL = webURL;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getType() {
        return type;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebURL() {
        return webURL;
    }
}
