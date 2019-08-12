package ObserverPattern;

import java.util.ArrayList;
import java.util.List;


// uses the subject interface to update all observers
public class StockGrabber implements Subject{

	private List<Observer> observers;
	private double imbPrice;
	private double aapPrice;
	private double googPrice;
	
	public StockGrabber(){
		observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer newObserver) {
		// TODO Auto-generated method stub
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		// TODO Auto-generated method stub
		
		int observerIndex = observers.indexOf(deleteObserver);
		
		if(observerIndex > -1){
			observers.remove(observerIndex);
			
			System.out.println("Observer " + ++observerIndex + " is deleted");
			
		}
		
		else{
			
			System.out.println("Sorry, the observer doesn't exist");
			
		}
		
	}
	
	

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(Observer observer: observers){
			observer.update(imbPrice, aapPrice, googPrice);
		}
		
	}


	public void setImbPrice(double imbPrice) {
		this.imbPrice = imbPrice;
		notifyObserver();
	}


	public void setAapPrice(double aapPrice) {
		this.aapPrice = aapPrice;
		notifyObserver();
	}


	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

}
