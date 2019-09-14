package DAOPattern;

import java.util.List;
import java.util.Optional;

/*
 *  DAO (Data Access Object) pattern is structure pattern 
 *  that allows us to isolate the application/business layer from the
 *  persistance layer (usually a relational database, but it could be any 
 *  other persistance mechanism) using an abstract API
 * 
 */

public interface DAO<T> {
	
	Optional<T> get(long id);
	
	List<T> getAll();
	
	void save(T it);
	
	void update(T t, String[] paragms);
	
	void delete(T t);
	
}
