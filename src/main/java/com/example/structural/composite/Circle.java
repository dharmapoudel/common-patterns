package com.example.structural.composite;
/**
 * Leaf
 */
public class Circle implements Graphic {

    //Draw Circle
    @Override
    public void draw() {
        System.out.println("Circle Drawn.");
    }
}