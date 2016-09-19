package test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class MVController {
	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("do...");
		return "hello";
	}
	
	
	//redirect
	@RequestMapping("redirect")
	public String redirect(){
		System.out.println("redirect...");
		return "redirect:hello";
	}
	
}
