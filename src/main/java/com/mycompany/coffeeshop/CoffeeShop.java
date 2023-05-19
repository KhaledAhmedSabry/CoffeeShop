package com.mycompany.coffeeshop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Khaled Ahmed Sabry
 */
//This is the CoffeeShop class that represents a coffee shop.
public class CoffeeShop {
    private String Name;
    private MenuItem[] Menu;
    private List<String> Orders;
    
    // parameterized constructor for the CoffeeShop class.
    public CoffeeShop(String name, MenuItem[] menu) {
        this.Name = name;
        this.Menu = menu;
        this.Orders = new ArrayList<>();
    }
    
    //The addOrder method adds an item to the orders list.
    public String addOrder(String itemName) {
        for (MenuItem item : Menu) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                Orders.add(item.getName());
                return "Order added!";
            }
        }
        return "This item is currently unavailable!";
    }
    
    //The fulfillOrder method serves the next order in the orders list.
    public String fulfillOrder() {
        if (!Orders.isEmpty()) {
            String item = Orders.get(0);
            Orders.remove(0);
            return "The " + item + " is ready!";
        }
        return "All orders have been fulfilled!";
    }
    
    //The listOrders method returns a copy of the orders list.
    public List<String> listOrders() {
        return Orders;
    }
    
    //The dueAmount method calculates the total amount due for the orders.
    public double dueAmount() {
        double totalAmount = 0.0;
        for (String item : Orders) {
            for (MenuItem menuItem : Menu) {
                if (menuItem.getName().equalsIgnoreCase(item)) {
                    totalAmount += menuItem.getPrice();
                    break;
                }
            }
        }
        return totalAmount;
    }
    
    //The cheapestItem method finds the item with the lowest price in the menu array.
    public String cheapestItem() {
        double minPrice = Double.MAX_VALUE;
        String cheapestItem = "";
        for (MenuItem item : Menu) {
            if (item.getPrice() < minPrice) {
                minPrice = item.getPrice();
                cheapestItem = item.getName();
            }
        }
        return cheapestItem;
    }

    //The drinksOnly method returns a list of item names from the menu array that have the type "drink".
    //It creates a new ArrayList called drinkItems to store the drink names.
    public List<String> drinksOnly() {
        List<String> drinkItems = new ArrayList<>();
        for (MenuItem item : Menu) {
            if (item.getType().equalsIgnoreCase("drink")) {
                drinkItems.add(item.getName());
            }
        }
        return drinkItems;
    }
    //The foodOnly method returns a list of item names from the menu array that have the type "food".
    public List<String> foodOnly() {
        List<String> foodItems = new ArrayList<>();
        for (MenuItem item : Menu) {
            if (item.getType().equalsIgnoreCase("food")) {
                foodItems.add(item.getName());
            }
        }
        return foodItems;
    }
}