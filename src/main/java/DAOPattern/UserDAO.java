package DAOPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDAO implements DAO<User>{

	private List<User> users = new ArrayList<>();
	
	public UserDAO() {
		users.add(new User("John", "john@gmail.com"));
		users.add(new User("Karim", "karim@gmail.com"));
	}
	
	@Override
	public Optional<User> get(long id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(users.get((int)id));
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		users.add(user);
	}

	@Override
	public void update(User user, String[] paragms) {
		// TODO Auto-generated method stub
		user.setName(Objects.requireNonNull(paragms[0], "Name cannot be null"));
		user.setEmail(Objects.requireNonNull(paragms[1], "Email cannot be null"));
		users.add(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		users.remove(user);
	}

}
