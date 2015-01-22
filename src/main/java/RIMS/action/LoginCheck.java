package RIMS.action;

import RIMS.service.UserService;

public class LoginCheck {
	public void setUserservice(UserService userservice) {
	}

	public boolean isLogin(String username,String userpassword) {
		if(username.equals("侯聪")&&userpassword.equals("123")){
			return true;
		}
		return false;
	}

}
