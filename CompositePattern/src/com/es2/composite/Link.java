package com.es2.composite;

public class Link extends Menu{

    String url;
    public Link(){}

    public String getUrl(){
        return url;
    }
    public void setURL(String URL){
        this.url=URL;
    }

    public void showOptions() {
        System.out.println(getLabel());
        System.out.println(url);
    }
}
