package com.company;

public class Table extends Item {
    private String shape;

    public Table(double cost, String shape){
        super(cost);
        this.shape = shape;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public String getShape(){
        return shape;
    }
    @Override
    public String toString(){
        return "Chair in form of "+shape+" costs "+this.cost;
    }
    @Override
    public double getPrice(){
        return cost;
    }

}
