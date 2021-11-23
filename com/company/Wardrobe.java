package com.company;

public class Wardrobe extends Item {
    private String color;

    public Wardrobe(double cost, String color){
        super(cost);
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    @Override
    public String toString(){
        return "Chair in "+color+" color costs "+this.cost;
    }
    @Override
    public double getPrice(){
        return cost;
    }
}
