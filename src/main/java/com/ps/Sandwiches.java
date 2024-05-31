package com.ps;

import java.util.ArrayList;

public class Sandwiches extends Products {
    private double sandwichPrice;



    private int size;

    private String bread;

    private ArrayList<String> regToppings;

    private ArrayList<String> meats;

    private ArrayList<String> cheeses;

    private ArrayList<String> sauces;

    public Sandwiches() {

    }

    public Sandwiches(double sandwichPrice, int size, String bread, ArrayList<String> regToppings, ArrayList<String> meats, ArrayList<String> cheeses, ArrayList<String> sauces) {
        this.sandwichPrice = sandwichPrice;
        this.size = size;
        this.bread = bread;
        this.regToppings = regToppings;
        this.meats = meats;
        this.cheeses = cheeses;
        this.sauces = sauces;
    }

    public double getSandwichPrice() {
        return sandwichPrice;
    }

    public void setSandwichPrice(double sandwichPrice) {
        this.sandwichPrice = sandwichPrice;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public ArrayList<String> getRegToppings() {
        return regToppings;
    }

    public void setRegToppings(ArrayList<String> regToppings) {
        this.regToppings = regToppings;
    }

    public ArrayList<String> getMeats() {
        return meats;
    }

    public void setMeats(ArrayList<String> meats) {
        this.meats = meats;
    }

    public ArrayList<String> getCheeses() {
        return cheeses;
    }

    public void setCheeses(ArrayList<String> cheeses) {
        this.cheeses = cheeses;
    }

    public ArrayList<String> getSauces() {
        return sauces;
    }

    public void setSauces(ArrayList<String> sauces) {
        this.sauces = sauces;
    }

    @Override
    public double calculatePrice() {

        price = 0;

        //logic if the sandwich is a 4 in,
        if(size == 4){
            price += 5.50;

            if(meats.isEmpty()){
                //nothing happens
                System.out.println(" no meat selected");
            } else if(meats.size() == 1){
                price += 1.00;
            } else {
                price += 1.00;
                price += (.50 * (meats.size() - 1));
            }

            if(cheeses.isEmpty()){
                System.out.println(" no cheese selected");
            } else if(cheeses.size() == 1){
                price+= .75;
            } else {
                price+= .75;
                price += (.30 * (cheeses.size() - 1));
            }


            //logic if the sandwich is an 8 in
        } else if(size== 8) {
            price += 7;

            if(meats.isEmpty()){
                //nothing happens
                System.out.println(" no meat selected");
            } else if(meats.size() == 1){
                price += 2.00;
            } else {
                price += 2.00;
                price += (1.00 * (meats.size() - 1));
            }

            // add cheese logic ere
        } else {
            //this is the logic for the 12 in sandwich
            price += 8.50;

            // same logic from above goes here for meats.
        }


        //when all ther orices asre added you should return the price

        return price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "sandwichPrice=" + sandwichPrice +
                ", size=" + size +
                ", bread='" + bread + '\'' +
                ", regToppings=" + regToppings +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", sauces=" + sauces +
                '}';
    }
// add toating option as an atribute
    //array of regularand premium toppings
    // extra toppings
    // length and bread should be 2 separte things. sandwich.size
//
}


