package test.springmvc.user;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private int id;

	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirth() {
		return birth;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}

}
