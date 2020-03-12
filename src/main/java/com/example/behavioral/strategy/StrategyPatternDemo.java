package com.example.behavioral.strategy;
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context c1 = new Context(new StrategyAdd());
      System.out.println("running strategy add: " + c1.runStrategy(5,  3));
      
      Context c2 = new Context(new StrategySubtract());
      System.out.println("running strategy subtract: " + c2.runStrategy(5,  3));
      
      Context c3 = new Context(new StrategyMultiply());
      System.out.println("running strategy multiply: " + c3.runStrategy(5,  3));
   }
}