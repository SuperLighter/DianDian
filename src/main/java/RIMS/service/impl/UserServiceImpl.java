package RIMS.service.impl;

import RIMS.dao.UserDAO;
import RIMS.entities.User;
import RIMS.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


	public User queryUserById(int id , String password) {
		// TODO Auto-generated method stub
			return userDAO.queryById(id , password);
	}


	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

}

