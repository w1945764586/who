package test.springmvc.user;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	public UserService(){
		System.out.println("UserService Constructor...");
	}
	
	public void save(){
		System.out.println("UserService save method.");
	}
	
}
