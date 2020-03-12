package com.example.structural.composite;
/**
 * Leaf
 */
public class Rectangle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Rectangle drawn.");
    }
}