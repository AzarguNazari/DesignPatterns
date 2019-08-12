package ObserverPattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

	//private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice){
		this.stockGrabber = stockGrabber;
		stock = newStock;
		price = newPrice;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			
			try{
				
				Thread.sleep(2000);
				
			}
			catch(InterruptedException ex){
				System.out.println("Exception occured in threading");
			}
			
			// Generateing a random number between -0.3 and 0.3
			double randomNumber = (Math.random() * 0.06) - 0.3;
			
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format(price + randomNumber));
			
			if(stock == "IBM") ((StockGrabber) stockGrabber).
			
		}
		
	}

}
