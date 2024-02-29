package com.es2.factorymethod;

public abstract class FactoryProduct {

    public FactoryProduct() {

    }

    public static Product makeProduct(String type) throws UndefinedProductException {
        if (type.equalsIgnoreCase("Computer")) {
            return new Computer();
        } else if (type.equalsIgnoreCase("Software")) {
            return new Software();
        }else{
            throw new UndefinedProductException("Cannot create: " + type);
        }

    }

}