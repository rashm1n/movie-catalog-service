package com.rashm1n.moviecatalogservice.models;

public class CatalogItem {
    private String name;
    private String decs;
    private int rating;

    public CatalogItem(String name, String decs, int rating) {
        this.name = name;
        this.decs = decs;
        this.rating = rating;
    }

    public CatalogItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
