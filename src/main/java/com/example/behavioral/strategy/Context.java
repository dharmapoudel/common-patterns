package com.example.behavioral.strategy;

public class Context {
	
	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}


	public int runStrategy(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
}
