package com.es2.factorymethod;

public class Computer implements Product{
    private String brand;
    protected Computer() {
    }

    //vai dar override à função implementada no Product
    public String getBrand() {
        System.out.println(brand);
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
