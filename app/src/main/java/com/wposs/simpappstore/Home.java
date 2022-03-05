package com.wposs.simpappstore;

import android.widget.ImageView;

public class Home {

    private ImageView cover;
    private ImageView icon;
    private String name;
    private String category;
    private String countStar;
    private ImageView star;
    private String sizeApp;

    public Home() {
        super();
    }

    public Home(ImageView cover, ImageView icon, String name, String category, String countStar, ImageView star, String sizeApp) {
        this.cover = cover;
        this.icon = icon;
        this.name = name;
        this.category = category;
        this.countStar = countStar;
        this.star = star;
        this.sizeApp = sizeApp;
    }

    public ImageView getCover() {
        return cover;
    }

    public void setCover(ImageView cover) {
        this.cover = cover;
    }

    public ImageView getIcon() {
        return icon;
    }

    public void setIcon(ImageView icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCountStar() {
        return countStar;
    }

    public void setCountStar(String countStar) {
        this.countStar = countStar;
    }

    public ImageView getStar() {
        return star;
    }

    public void setStar(ImageView star) {
        this.star = star;
    }

    public String getSizeApp() {
        return sizeApp;
    }

    public void setSizeApp(String sizeApp) {
        this.sizeApp = sizeApp;
    }
}
