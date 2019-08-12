package StrategyPattern;

public class Main {

	/**
	 * 	Strategy Pattern
	 *  this pattern is a behavioral software design pattern that enables selecting an algorithm at
	 *  runtime. Instead of implmenting a single algorithm directly, code receives run-time instruction
	 *  as to which in a family of algorithms to use.
	 *  
	 *  Strategy lets the algorithm vary independtly from clients that use it. 
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println("Dog flying mode: " + dog.tryToFly());
		System.out.println("Bird flying mode: " + bird.tryToFly());
		
		dog.setFlyAvailability(new ItFly());
		

		System.out.println(dog.tryToFly());
		
	}
	
	
}
