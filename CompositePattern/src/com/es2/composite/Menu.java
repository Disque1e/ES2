package com.es2.composite;

public abstract class Menu{

    public String Label;
    public Menu(){}

    public String getLabel(){
        return Label;
    }


    public void setLabel(String lable){
        this.Label = lable;
    }
    public abstract void showOptions();
}
