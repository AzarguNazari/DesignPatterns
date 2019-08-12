package StrategyPattern;

public interface Flys {
	String fly();
}

class ItFly implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Flying High";
	}
	
}

class CantFly implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I can't fly";
	}
	
}