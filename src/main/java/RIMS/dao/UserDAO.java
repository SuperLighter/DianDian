package RIMS.dao;

import RIMS.entities.User;

public interface UserDAO {
	public void save(User u);
	
	public void update(User u);
	
	public User queryById(int id , String password); 

}
