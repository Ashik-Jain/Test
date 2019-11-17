package main.com.ge.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ApplicationImpl extends Application {

	public ApplicationImpl(String id, String name) {
		super(id, name);
	}
		
	private static List<User> users=new ArrayList<User>();
	private static List<Group> groups=new ArrayList<Group>();
	
	
	public void setUsers(User user) {
		users.add(user);
		
	}
	@Override
	public Collection<User> getUsers() {
		return users;
	}

	
	@Override
	public User getUser(String userId) {
		for (User user : users) {
			if(user.getId().equals(userId))
			{
				return user;
			}
		}
		return null;
	}

	@Override
	public Collection<Group> getGroups() {
		return groups;
	}

	@Override
	public Group getGroup(String groupId) {
		for (Group group : groups) {
			if(group.getId().equals(groupId))
			{
				return group;
			}
		}
		return null;
	}
	
	public void setGroups(Group group) {
		groups.add(group);
		//group.size=groups.size();
		}
}
