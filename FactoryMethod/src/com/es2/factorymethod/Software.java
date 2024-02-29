package com.es2.factorymethod;

public class Software implements Product{
    private String brand;

    protected Software()
    {
    }
    public String getBrand(){
        System.out.println(brand);
        return  brand;
    }

    public void setBrand(String Brand){
        this.brand=Brand;
    }
}
