package com.example.kenburnsview;

public class TravelModel {
    private String title, location, imageUrl;
    private float starRating;

    public TravelModel( String title, String location, String imageUrl, float starRating ) {
        this.title = title;
        this.location = location;
        this.imageUrl = imageUrl;
        this.starRating = starRating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation( String location ) {
        this.location = location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl( String imageUrl ) {
        this.imageUrl = imageUrl;
    }

    public float getStarRating() {
        return starRating;
    }

    public void setStarRating( float starRating ) {
        this.starRating = starRating;
    }
}
