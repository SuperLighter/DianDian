package RIMS.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import RIMS.entities.User;
import RIMS.dao.UserDAO;


public class UserDAOImpl implements UserDAO{
    private SessionFactory sessionFactory;  
    
    public SessionFactory getSessionFactory() {  
        return sessionFactory;  
    }  
  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }  
  
    private Session getCurrentSession() {  
        return sessionFactory.getCurrentSession();  
    }  

	public void save(User u) {
		// TODO Auto-generated method stub		
	}

	public void update(User u) {
		// TODO Auto-generated method stub
	}

	public User queryById(int id , String password) {
		// TODO Auto-generated method stub
		String hql = "FROM User WHERE (userid = ? and userpassword = ?)";
		Query query = this.getCurrentSession().createQuery(hql).setLong(0, id).setString(1, password);
		System.out.println(null==query.uniqueResult());
		if(null==query.uniqueResult()){
			return null;
		}
		return (User) query.uniqueResult();
	}
}
