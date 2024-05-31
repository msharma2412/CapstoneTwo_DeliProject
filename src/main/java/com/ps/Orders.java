
package com.ps;

import java.util.ArrayList;

class Order {

    private ArrayList<Products> customerOrder;

    public Order(){
    }

    public void addProduct(Products product){
        customerOrder.add(product);
    }


    // user logiic should be in thr userinterface
    public void getOrderDetails() {
        //just a method to add to show what items are in the order
        for(Products item: customerOrder){
            System.out.println(customerOrder.toString());
        }
    }

    public void removePrdouct (Products product){
        if(this.customerOrder.remove(product)){
            System.out.println("Item removed from order");
        } else {
            System.out.println("Error. Unknown item.");
        }

    }

    // Calculate and display the total price


    // Proceed with payment or other checkout processes
}

// Method to calculate the total price based on sandwich type and toppings

// Example Sandwich class for contex




// in the order class. it is a blueprint of sandwiches. You will get info
//from the user to get info from the user and use getters and setters from the
// look up how tozz