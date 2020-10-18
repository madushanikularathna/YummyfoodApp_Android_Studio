package com.example.yummyy;

public class Food {
    private int id;
    private String name;
    private String price;
    private byte[] image;

    public Food(String name, String price, byte[] image, int id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
