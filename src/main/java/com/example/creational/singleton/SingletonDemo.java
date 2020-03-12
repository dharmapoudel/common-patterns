package com.example.creational.singleton;
class SingletonDemo{
    public static void main(String[] args) {
        SingleObject object=SingleObject.getInstance();
        object.showMessage();
    }
}