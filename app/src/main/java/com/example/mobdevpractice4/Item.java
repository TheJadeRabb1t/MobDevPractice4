package com.example.mobdevpractice4;

public class Item {
    private String hotelName;
    private int imageId;

    public Item(String hotelName, int imageId) {
        this.hotelName = hotelName;
        this.imageId = imageId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
