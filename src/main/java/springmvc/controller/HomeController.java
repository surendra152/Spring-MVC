package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")	
	public String home(Model model)
	{
		System.out.println("This is home Controller");
		//model
		//sending data from controller to view
		model.addAttribute("name","Surendra Bisoyi");
		model.addAttribute("Id",7878);
		
		List<String> frnds=new ArrayList<String>();
		frnds.add("Vandana");
		frnds.add("Joshi");
		frnds.add("John");
		frnds.add("ishan");
		
		model.addAttribute("f",frnds);
		
		return"index";
	}

	@RequestMapping("/about")	
	public String about()
	{
		System.out.println("This is about Controller");
		return"about";
	}
	
	@RequestMapping("/services")	
	public String services()
	{
		System.out.println("This is services Controller");
		return"services";
	}
	
	@RequestMapping("/help")	
	public ModelAndView help()
	{
		System.out.println("This is help Controller");
		
		//ModelAndView object
		ModelAndView obj=new ModelAndView();
		
		//setting the data
		obj.addObject("name", "Katrina");
		obj.addObject("rollno", 122);
		
		LocalDateTime date = LocalDateTime.now();
		obj.addObject("Date",date);
		
		
		//marks
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(25);
		list.add(60);
		list.add(80);
		list.add(70);
		list.add(100);
		
		obj.addObject("marks",list);
		
		//setting view name
		obj.setViewName("help");
		
		return obj;
	}
	
	
	
}
