package com.company;

public class Chair extends Item{
    private String material;

    public Chair(double cost, String material){
        super(cost);
        this.material = material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }
    @Override
    public String toString(){
        return "Chair made of "+material+" costs "+this.cost;
    }
    @Override
    public double getPrice(){
        return cost;
    }

}
