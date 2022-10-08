package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;


@Controller
public class ContactController {
	
	//to available the userservice object automatically use @Autowired annotation
	@Autowired
	private UserService userService;
	
	@ModelAttribute	
	public void commonDataforModel(Model m)
	{
		m.addAttribute("Header","Learn Java Programming lan");
		m.addAttribute("Desc","Home for programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		return "contact";
	}

	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
		
		if(user.getUserName().isBlank())
		{
			return"redirect:/contact";
		}
		//to save in the database
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg","User Created with id"+createdUser);
		return "success";
	}


}


//the below code is replaced by @ModelAttribute

/* by using @RequestParam tag
 * @RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("userName") String Name,
			@RequestParam("userPassword") String Password,Model model)
	{



		User user=new User();
		
		user.setEmail(userEmail);
		user.setUserName(Name);
		user.setUserPassword(Password);

		System.out.println(user);
		//to print in console
		//System.out.println("User mail: "+userEmail);
		//System.out.println("User name: "+Name);
		//System.out.println("User password: "+Password);

		//Model
		//model.addAttribute("Mail",userEmail);
		//model.addAttribute("UName",Name);
		//model.addAttribute("Upassowrd",Password);
		model.addAttribute("userData",user);
		return "success";
	}
 */




