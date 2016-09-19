package test.springmvc.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/in")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	//http://127.0.0.1:8080/TestSpringMVC/in/user?name=123&id=001&birth=2015-08-09 10:34:56
	@RequestMapping("/user")
	public String saveUser(@RequestBody @ModelAttribute User u ){
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getBirth());
		userService.save();
		return "user";
	}
	
	@RequestMapping(value = "/json", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> json(){
		System.out.println("json...");
		Map<String, Object> jsonMap = new HashMap<>(2);
		jsonMap.put("msg", "arg");
		return jsonMap;
	}
	
	
	
	
	
}
