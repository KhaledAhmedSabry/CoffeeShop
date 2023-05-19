/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coffeeshop;

/**
 *
 * @author Khaled Ahmed Sabry
 */
public class main {
    public static void main(String[] args) {
        
        // Create menu items
        MenuItem[] menu = {
            new MenuItem("Cinnamon Roll", "Food", 1.99),
            new MenuItem("Iced Coffee", "Drink", 2.49),
            new MenuItem("Hot Chocolate", "Drink", 1.99),
            new MenuItem("Tuna Sandwich", "Food", 4.99),
            new MenuItem("Lemonade", "Drink", 1.49),
            // Add more items as needed here
        };
        
        // Create a CoffeeShop instance from CoffeeShop class
        CoffeeShop coffeeShop = new CoffeeShop("Tesha's Coffee Shop", menu);

        // Add orders
        System.out.println(coffeeShop.addOrder("Hot Cocoa")); // -> This item is currently unavailable!
        System.out.println(coffeeShop.addOrder("Iced Tea")); // -> This item is currently unavailable!
        System.out.println(coffeeShop.addOrder("Cinnamon Roll")); // -> Order added!
        System.out.println(coffeeShop.addOrder("Iced Coffee")); // -> Order added!

        // List orders
        System.out.println(coffeeShop.listOrders()); // [Cinnamon Roll, Iced Coffee]

        // Fulfill orders
        System.out.println(coffeeShop.fulfillOrder()); // -> The Cinnamon Roll is ready!
        System.out.println(coffeeShop.fulfillOrder()); //->  The Iced Coffee is ready!
        System.out.println(coffeeShop.fulfillOrder()); // -> All orders have been fulfilled!

        // List orders after fulfillment
        System.out.println(coffeeShop.listOrders()); // []

        // Calculate due amount
        System.out.println(coffeeShop.dueAmount()); // 0.0

        // Find the cheapest item
        System.out.println(coffeeShop.cheapestItem()); // Lemonade

        // Get drink items only
        System.out.println(coffeeShop.drinksOnly()); // [Iced Coffee, Hot Chocolate, Lemonade]

        // Get food items only
        System.out.println(coffeeShop.foodOnly()); // [Cinnamon Roll, Tuna Sandwich]
    }
}
