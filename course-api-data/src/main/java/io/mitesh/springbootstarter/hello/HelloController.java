package io.mitesh.springbootstarter.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@GetMapping("/")
	public String sayHi()
	{
		return ("<h1> Welcome </h1>");
	}
	
	@GetMapping("/user")
	public String sayHiToUser()
	{
		return ("<h1> Welcome User</h1>");
	}
	
	@GetMapping("/admin")
	public String sayHiToAdmin()
	{
		return ("<h1> Welcome Admin</h1>");
	}
}
