package ObserverPattern;

// Represents each observer that is monitoring changes in the subject
public class StockObserver implements Observer{

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double aplePrice, double googlPrice) {
		// TODO Auto-generated method stub
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aplePrice;
		this.googPrice = googlPrice;
		
		printThePrices();
	}

	public void printThePrices(){
		System.out.println(observerID);
		System.out.println("IBM: " + ibmPrice);
		System.out.println("AAPL: " + aaplPrice);
		System.out.println("GOOG: " + googPrice);
	}
}
