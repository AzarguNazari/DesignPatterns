package DAOPattern;

import java.util.Optional;

public class UserApplication {

	private static DAO userDAO;
	
	public static void main(String[] args) {
		
		userDAO = new UserDAO();
		
		User user1 = getUser(0);
		System.out.println(user1);
		userDAO.update(user1, new String[] {"Jake", "jake@gmail.com"});
	
		User user2 = getUser(1);
		System.out.println(user2);
		userDAO.update(user2, new String[] {"Jake", "jake@gmail.com"});
	
		
		userDAO.getAll().forEach(System.out::println);
	}
	
	private static User getUser(long id) {
		Optional<User> user = userDAO.get(id);
		
		return user.orElseGet(() -> new User("non-existing user", "no-email"));
	}
	
}
