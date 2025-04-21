package com.zipcode.beans;

public class Item {

    private Long id;
    private String type;
    private String model;
    private String barCodeNumber;
    private String imageUrl;
    private Long locationId;


    public Item(Long id, String type, String model, String barCodeNumber, String imageUrl, Long locationId) {
        this.id = id;
        this.type = type;
        this.model = model;
        this.barCodeNumber = barCodeNumber;
        this.imageUrl = imageUrl;
    }

    public Item(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBarCodeNumber() {
        return barCodeNumber;
    }

    public void setBarCodeNumber(String barCodeNumber) {
        this.barCodeNumber = barCodeNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

}
