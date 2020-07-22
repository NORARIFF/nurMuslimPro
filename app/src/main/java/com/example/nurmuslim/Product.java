package com.example.nurmuslim;

public class Product {
    private String name;
    private String factory_location;
    private String selling_place;
    private String description;
    private String profilePic;


    public Product() {
    }

    public Product(String name, String factory_location, String selling_place, String description, String profilePic) {
        this.name = name;
        this.factory_location = factory_location;
        this.selling_place = selling_place;
        this.description = description;
        this.profilePic = profilePic;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory_location() {
        return factory_location;
    }

    public void setFactory_location(String factory_location) {
        this.factory_location = factory_location; }

    public String getSelling_place() {
        return selling_place;
    }

    public void setSelling_place(String selling_place) {
        this.selling_place = selling_place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfilePic(){ return profilePic; }

    public void setProfilePic(String profilePic){ this.profilePic = profilePic;}


}
