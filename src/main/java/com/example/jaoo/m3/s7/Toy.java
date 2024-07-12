/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s7;

/**
 * A sample base class
 */
public class Toy {
    private int price;

    /**
     * Canonical constructor
     * 
     * @param price toy price
     */
    public Toy(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy [price=" + price + "]";
    }
}
