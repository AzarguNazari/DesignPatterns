package ObserverPattern;

public class Main {

	public static void main(String[] args) {

		// create the Subjewct Object
		// It will handle updating all observers
		// as well as delting and adding them

		StockGrabber stockGrabber = new StockGrabber();

		// create an Observer that will be sent updates from subject
		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setImbPrice(197.0);
		stockGrabber.setAapPrice(677.00);
		stockGrabber.setGoogPrice(676.40);

		StockObserver observer2 = new StockObserver(stockGrabber);

		stockGrabber.setImbPrice(197.0);
		stockGrabber.setAapPrice(677.00);
		stockGrabber.setGoogPrice(676.40);

		StockObserver observer3 = new StockObserver(stockGrabber);

		stockGrabber.setImbPrice(197.0);
		stockGrabber.setAapPrice(677.00);
		stockGrabber.setGoogPrice(676.40);

		// create 3 threads using the Runnable interface
		// GetTheStock implements Runnable, so it doesn't waste
		// Its one extendable class options
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 676.60);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);
		
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
	}

}
