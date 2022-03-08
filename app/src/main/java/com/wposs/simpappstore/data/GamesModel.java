package com.wposs.simpappstore.data;

public class GamesModel {

    private int cover;
    private int icon;
    private String name;
    private String category;
    private String countStar;
    private int star;
    private String sizeApp;
    private int viewType;

    private static final int ItemPopularityApps = 0;
    private static final int ItemAd = 1;
    private static final int ItemPopularityGames = 2;

    public GamesModel(int cover, int icon, String name, String category, String countStar, int star, String sizeApp) {
        this.cover = cover;
        this.icon = icon;
        this.name = name;
        this.category = category;
        this.countStar = countStar;
        this.star = star;
        this.sizeApp = sizeApp;
    }

    public GamesModel(int viewType) {
        this.viewType = viewType;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

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

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getSizeApp() {
        return sizeApp;
    }

    public void setSizeApp(String sizeApp) {
        this.sizeApp = sizeApp;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public static final class Companion {
        private Companion() {

        }
    }
}
