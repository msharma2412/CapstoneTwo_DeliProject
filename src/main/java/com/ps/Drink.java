package com.ps;

public class Drink extends Products {
    private final String[] Drink = {"Sprite", "Fanta", "Coke"};

    private String size;

    private String flavor;

    public Drink() {
        this.size = size;
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public double calculatePrice() {

        // we have to do the logic to return the proper price
        //after we set it
        return switch (size.toLowerCase()) {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0.0;
        };


    }
}