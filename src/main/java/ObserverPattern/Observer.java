package ObserverPattern;

// The Observers update method is called when the subject changes
public interface Observer {
	public void update(double ibmPrice, double aplePrice, double googlPrice);
}
