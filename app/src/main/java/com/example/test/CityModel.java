package com.example.test;

public class CityModel {
    String name;
    int Image;
    String decription;


    public CityModel (String name, int image, String description) {
        this.name=name;
        this.Image=image;
        this.decription = description;


    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }







}
