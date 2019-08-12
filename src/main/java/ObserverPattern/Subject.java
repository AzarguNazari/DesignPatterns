package ObserverPattern;


/**
 * 
 * This interface handles adding, deleting and updating of all observers
 * 
 * @author ba063339
 *
 */
public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
	
}
