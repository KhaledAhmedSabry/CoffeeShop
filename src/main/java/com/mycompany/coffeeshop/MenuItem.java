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
// This class represents an item on the menu
public class MenuItem {
    private String Name;
    private String Type;
    private double Price;
    
    // parameterized constructor for the MenuItem class
    public MenuItem(String name, String type, double price) {
        this.Name = name;
        this.Type = type;
        this.Price = price;
    }
    
    //Get Name
    public String getName() {
        return Name;
    }
    
    //Get Type
    public String getType() {
        return Type;
    }
    
    //Get Price
    public double getPrice() {
        return Price;
    }
}