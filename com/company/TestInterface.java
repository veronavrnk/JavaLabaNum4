package com.company;

public class TestInterface {
    public static void main(String[] args) {
        Priceable p = new Table(12000, "circle");
        System.out.println(p);
        System.out.println(p.getPrice());
        p = new Wardrobe(17000, "White");
        System.out.println(p);
        p = new Chair(6000, "Wood");
        System.out.println(p);
    }

}