package springmvc.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

//as this is accessing the data so spring will know if we use @Repository annotation
//if we use the this annotation then we do not have to declare in xml file manually 
@Repository
public class UserDao {
	
	//to import the HibernateTemplate template object automatically from spring container we will use Auto wired annotation				
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user)
	{
		//we are saving the data by using HibernateTemplate
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}
}
