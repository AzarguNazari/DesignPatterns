package StrategyPattern;

public class Bird extends Animal{
	public Bird(){
		super();
		setSound("Tweet");
		flyingTYpe = new ItFly();
	}
}

class Dog extends Animal{
	public Dog(){
		super();
		setSound("Bark");
		flyingTYpe = new CantFly();
	} 
}
