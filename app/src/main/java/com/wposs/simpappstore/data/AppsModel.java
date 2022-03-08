package com.wposs.simpappstore.data;

public class AppsModel {

    public AppsModel(int icon, String name, String sizeApp) {
        this.icon = icon;
        this.name = name;
        this.sizeApp = sizeApp;
    }

    private int icon;
    private String name;
    private String sizeApp;

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSizeApp() {
        return sizeApp;
    }

    public void setSizeApp(String sizeApp) {
        this.sizeApp = sizeApp;
    }
}
