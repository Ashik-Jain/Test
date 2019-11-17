package main.com.ge.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GroupImpl extends Group {

	public GroupImpl(String id, String name) {
		super(id, name);
	}

    private static List<User> users=new ArrayList<User>();
	
	public void setUsers(User user) {
		users.add(user);
		super.size=users.size();
	}
	
	public Collection<User> getUsers() {
		return users;
	}

	public User getUser(String userId) {
		for (User user : users) {
			if(user.getId().equals(userId))
			{
				return user;
			}
		}
		return null;
	}
}
