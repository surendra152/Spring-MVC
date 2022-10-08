package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User;

//it is service layer so spring will know if we use @service annotation
//if we use the this annotation then we do not have to declare in xml file manually 

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user)
	{
		return this.userDao.saveUser(user);
	}
}
