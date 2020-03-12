package com.example.structural.composite;
/**
 * Client
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
    	//composite pattern Graphics
    	
        //creates leaf objects
        Graphic circle = new Circle();
        Graphic rectangleA = new Rectangle();
        Graphic rectangleB = new Rectangle();

        //Initialize composite graphic i.e. picture
        Picture picture = new Picture();
        picture.add(circle);
        picture.add(rectangleA);
        picture.add(rectangleB);
        //prints complete picture
        picture.draw();
        System.out.println("Remove one leaf --> Rectangle object");
        //removes a graphic from picture
        picture.remove(rectangleA);
        //prints new picture
        picture.draw();
        
        
        // composite pattern Employee
        
        Employee CEO = new Employee("John","CEO", 30000);
        Employee headSales = new Employee("Robert","Head Sales", 20000);
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO); 
        
        for (Employee headEmployee : CEO.getSubordinates()) {
           System.out.println(headEmployee);
           
           for (Employee employee : headEmployee.getSubordinates()) {
              System.out.println(employee);
           }
        }		
    }
}