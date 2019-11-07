package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private float cost;
    private String description;
    private String manufacturer;

    public Product(){

    }
    public Product(int id,String name,float cost,String description,String manufacturer){
        this.id=id;
        this.name=name;
        this.cost=cost;
        this.description=description;
        this.manufacturer=manufacturer;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
