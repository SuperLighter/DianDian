package RIMS.action;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import net.sf.json.JSONObject;

import RIMS.entities.User;
import RIMS.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class LoginAction extends ActionSupport implements ServletRequestAware,
ServletResponseAware,SessionAware{
	private int userid;
	private String userpassword=null;
	
    HttpServletRequest request;  
    
    HttpServletResponse response;
    
    private Map<String, Object> session;

	private UserService userService;
    
    private User u;
    	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	
	public String execute() throws Exception
	{
		u = userService.queryUserById(userid,userpassword);
		if(null==u){
			return "false";
		} 
		request.setAttribute("u", u);
		return "success";
	} 
	
	public void LoginApp()  {
		try {
			/* User user = new User();
			user.setUsername("123");
			user.setUserpassword("321");	
			JSONObject jsonObject = JSONObject.fromObject(user); */
						
			u = userService.queryUserById(userid,userpassword);
			if(null!=u){
			    ActionContext.getContext().getSession().put("login", true);
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("userid", u.getUserid());
				jsonObject.put("username", u.getUsername());
				jsonObject.put("userpassword", u.getUserpassword());
				
				this.response.setContentType("text/json;charset=utf-8");  
		        this.response.setCharacterEncoding("UTF-8");
				
		        
		        byte[] jsonBytes = jsonObject.toString().getBytes("utf-8");  
		        response.setContentLength(jsonBytes.length);  
		        response.getOutputStream().write(jsonBytes);  
		        response.getOutputStream().flush();  
		        response.getOutputStream().close(); 
			}else{
		        byte[] jsonBytes = "登陆错误！".getBytes("utf-8");  
		        response.setContentLength(jsonBytes.length);  
		        response.getOutputStream().write(jsonBytes);  
		        response.getOutputStream().flush();  
		        response.getOutputStream().close(); 
			}
				        
			/*ServletActionContext.getRequest().setAttribute("data", jsonObject.toString());
			 */
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

}
