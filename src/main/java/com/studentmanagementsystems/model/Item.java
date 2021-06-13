package com.studentmanagementsystems.model;

import java.text.DecimalFormat;

public abstract class Item {
    /*
    Here and force I will stack my methods on the top of each class
    */
    DecimalFormat decimalFormat = new DecimalFormat();
    public boolean isAvailable(){
        if(numberOfItems >= 1){
            return true;
        }else{
            return false;
        }

    }
    public void removeItem(){
        numberOfItems -= 1;
    }

    public String toString(){
        String str = String.format(" %1$-20s %2$-10s %3$s", name, "$" + decimalFormat.format(price), this.getNumberOfItems());
    return str;
    }

    private String name;
    private double price;
    private double numberOfItems;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(double numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
}
