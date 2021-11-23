package com.company;

public abstract class Item implements Priceable {
    public double cost;

public Item(double cost){
    this.cost = cost;
}

public void setCost(double cost) {
    this.cost = cost;
}

public double getPrice(){
    return cost;
}

public String toString(){
    return ("Item costs "+cost);
}

}
