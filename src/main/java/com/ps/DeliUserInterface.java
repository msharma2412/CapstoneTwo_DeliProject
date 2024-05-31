package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliUserInterface {
    private final String[] regularToppings = {"lettuce", "peppers", "onions", "tomatoes",
            "jalepenos", "cucumbers", "pickles", "guacamole",
            "mushrooms"};
    private final String[] meats = {"steak", "ham", "salami", "roast beef", "chicken", "bacon"};
    private final String[] cheeses = {"american", "provolone", "cheddar", "swiss"};
    private final String[] condiments = {"mayo", "mustard", "ketchup", "ranch", "thousand island", "vinaigrette"};
    private final String[] sauce = {"au jus", "sauce"};
    private final String[] Drink = {"Sprite", "Fanta", "Coke"};
    private final String[] Chip = {"Lays", "Doritos", "Fritos"};

    private Scanner scanner = new Scanner(System.in);

//Things to do
    //1. Write method to print out vegetables
    //2. Write method to print out toppings

    //this methods is specifically creating a sandwich to
    // to add to an order

    public Sandwiches addSandwich() {

        Sandwiches newSandwich = new Sandwiches();
//  user select size
        System.out.println("\nSelect sandwich size:");
        System.out.println("1. 4 in");
        System.out.println("2. 8 in");
        System.out.println("3. 12 in");
        System.out.print("Enter the number of your choice: ");

        int sizeChoice = scanner.nextInt();

        String size;
        switch (sizeChoice) {
            case 1:
                newSandwich.setSize(4);
                break;
            case 2:
                newSandwich.setSize(8);
                break;
            case 3:
                newSandwich.setSize(12);
                break;
            default:
                size = "Unknown";
                System.out.println("Invalid choice. Defaulting to Medium size.");
        }

        // Needs refactoring
        System.out.println("Select bread");
        System.out.println("1- White");
        System.out.println("2- Wrap");
        System.out.println("3- Wheat");
        System.out.println("5- Rye");
        System.out.println("7- Exit Menu)");
        System.out.println("0- Quit");

        System.out.print("Please choose an option: ");

        int mainMenuCommand = scanner.nextInt();
        //user selected bread
        //switch allows us to choose options
        switch (mainMenuCommand) {
            case 1:
                newSandwich.setBread("White");
                break;
            case 2:
                newSandwich.setBread("Wheat");
                break;
            case 3:
                newSandwich.setBread("Wrap");
                break;
            case 4:
                newSandwich.setBread("Rye");
                break;
            case 7:
            case 0:
            default:
                newSandwich.setBread("White");
                System.out.println("Invalid choice. Defaulting to White bread.");
        }

        System.out.println("Would you like your sandwich toasted?");
        System.out.println("1 for toasted");
        System.out.println("2 for untoasted");

        int toastedChoice = scanner.nextInt();

        boolean toasted = false;

        switch (toastedChoice) {
            case 1:
                toasted = true;
                break;
            case 2:
                toasted = false;
                break;
            default:
                System.out.println("Invalid choice. Assuming untoasted.");
                toasted = false;
                break;
        }

        System.out.println("Select Meat");
        System.out.println("Extra meat available at additional cost");
        //ist for displaying purposes
        for (int i = 0; i < meats.length; i++) {
            System.out.println((i + 1) + " " + meats[i]);
        }

        System.out.println("Please select all options that apply");

        Integer selection = scanner.nextInt();

        // the best way to retrieve multiple toppings.
        // from readline to add to arrays on Sandwich class
        System.out.println(selection);
        String selectionString = selection.toString();
        String[] selectionArray = selectionString.split("");

        ArrayList<String> meatArray = new ArrayList<>();

        for (String index : selectionArray) {
            meatArray.add(meats[Integer.parseInt(index) - 1]);
        }

        newSandwich.setMeats(meatArray);
//        System.out.println(newSandwich.getMeats());
///       for now we just want to display the meant choice


        System.out.println("Select cheese");
        System.out.println("Extra cheese available at additional cost");
        for (int i = 0; i < cheeses.length; i++) {
            System.out.println((i + 1) + " " + cheeses[i]);
        }
        System.out.println("Please select all options that apply");
        Integer cheeseSelection = scanner.nextInt();

        // End of Cheese

        // Begin Topping
        System.out.println("Select topping");
        System.out.println("Choose topping");
        for (int i = 0; i < regularToppings.length; i++) {
            System.out.println((i + 1) + " " + regularToppings[i]);
        }
        System.out.println("Please select all options that apply");
        Integer regularToppingsSelection = scanner.nextInt();
        // Add the toppings to the sandwich

        //
        System.out.println("Select condiments");
        System.out.println("Choose condiments");
        for (int i = 0; i < condiments.length; i++) {
            System.out.println((i + 1) + " " + condiments[i]);
        }
        System.out.println("Please select all options that apply");
        Integer condiments = scanner.nextInt();

        System.out.println("Select sauce");
        System.out.println("Choose sauce");
        for (int i = 0; i < sauce.length; i++) {
            System.out.println((i + 1) + " " + sauce[i]);
        }
        System.out.println("Please select all chip options that apply");
        Integer sauce = scanner.nextInt();


        Drink newDrink = new Drink();

        System.out.println("Select drink");
        System.out.println("Choose drink");
        for (int i = 0; i < Drink.length; i++) {
            System.out.println((i + 1) + " " + Drink[i]);
        }
        System.out.println("Please select all drink options that apply");
        Integer drink = scanner.nextInt();

        Chips newChip = new Chips();

        System.out.println("Select chip");
        System.out.println("Choose chip");
        for (int i = 0; i < Chip.length; i++) {
            System.out.println((i + 1) + " " + Chip[i]);
        }
        System.out.println("Please select all options that apply");
        Integer Chip = scanner.nextInt();


        switch (cheeseSelection) {
            case 1:
                //     System.out.println(addSandwich().toString());
            case 2:
                System.out.println("Add Drink");
            case 3:
                System.out.println("Add Chips");
            case 4:
                System.out.println("Checkout");
        }

        // Development
        System.out.println(newSandwich);
        System.out.println(newSandwich.getSandwichPrice());
        // Development


        // Add the sandwich to the order
        return newSandwich;

//        private void displaySandwich(List<Sandwich> sandwich){
//
//            for(Sandwich sandwich:Sandwich){
////            "----  All Vehicles ----
//                System.out.printf(Meat: %d, Year: %d, Make: %s, Model: %s, Type: %s, Color: %s, Odometer: %d, Price: %.2f\n",
//                        vehicle.getVin(),
//                        vehicle.getYear(),
//                        vehicle.getMake(),
//                        vehicle.getModel(),
//                        vehicle.getVehicleType(),
//                        vehicle.getColor(),
//                        vehicle.getOdometer(),
//                        vehicle.getPrice()
//                );
    }

    public void addDrink(Drink drink){

        // Last line: Add the drink to the order
    }
}
