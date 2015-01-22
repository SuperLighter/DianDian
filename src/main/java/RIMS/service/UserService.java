package RIMS.service;
import RIMS.entities.User;

public interface UserService {
	
	public boolean addUser(User u);
		
	public boolean updateUser(User u);
	
	public User queryUserById(int id , String password);
}
