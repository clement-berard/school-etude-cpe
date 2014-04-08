

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserManager {
	HashMap<String, User> userMap = new HashMap<String, User>();
	
	public UserManager() {
		userMap.put("user1@gmail.com", new User("user1@gmail.com", "prenom1", "nom1"));
		userMap.put("user2@gmail.com", new User("user2@gmail.com", "prenom2", "nom2"));
		userMap.put("user3@gmail.com", new User("user3@gmail.com", "prenom3", "nom3"));
	}

	public User getUser(String email) {
		return userMap.get(email);
	}

	public List<User> listUsers() {
		return new ArrayList<User>(userMap.values());
	}

}
