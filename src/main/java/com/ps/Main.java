package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in); //Scanner will accept innput from the user
    static boolean running = true;// this keeps it running
    public static DeliUserInterface deliUserInterface = new DeliUserInterface();

    public static void main(String[] args) {
        System.out.println("Welcome to our Deli");
        System.out.println();
        System.out.println();
        homeScreen();
    }

    public static void homeScreen(){
        System.out.println("""
                Select an option 1 or 2;
                                    
                1.New Order
                2.Exit application
                                    
                                    
                
                """);
        int choice = scanner.nextInt();

        if(choice == 2){
            running = false;
        } else if(choice == 1){
            orderScreen();
        }
    }
    static void orderScreen(){
        deliUserInterface.addSandwich();
    }










}