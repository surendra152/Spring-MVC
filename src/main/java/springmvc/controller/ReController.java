package springmvc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
		
		//Redirect Prefix
		@RequestMapping("/one")
		public String one()
		{
			System.out.println("This is one handler");
			return "redirect:/two";
		}
		
		//RedirectView
		/*
		@RequestMapping("/three")
		public RedirectView three()
		{
			System.out.println("This is one handler");
			
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl("two");
			
			return redirectView;
		}
		*/
		
		//HttpSevletResponse
		//not recommened to use this way 
		/*
		@RequestMapping("/one")
		public String three(HttpServletResponse response)
		{
			System.out.println("This is one handler");
			response.sendRedirect("");
			
			return "";
		}
		*/
		
		
		@RequestMapping("/two")
		public String two()
		{
			System.out.println("This is two handler");
			return "";
		}
		
		
		
}
