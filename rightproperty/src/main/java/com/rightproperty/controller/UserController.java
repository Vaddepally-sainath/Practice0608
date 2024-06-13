package com.rightproperty.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rightproperty.beans.Logindets;
import com.rightproperty.beans.ResponseObject;

import com.rightproperty.entity.User;

import com.rightproperty.service.ServiceImpl;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private final ServiceImpl serv;
	
	
	
	

	public UserController(ServiceImpl serv  ) {
		super();
		this.serv = serv;
		
	}

	@PostMapping("/details")
	public ResponseEntity<String> add(@RequestBody User user) throws Exception  {
		 
		 
		 User newuser=serv.add(user);
		ResponseObject n= new ResponseObject(newuser.getFname(),"200 OK");
		return new ResponseEntity<String>(n.toString(),HttpStatus.OK);
		
	}
	
	@GetMapping("/details")
	public ResponseEntity<List<User>> getusers(){
		return new ResponseEntity<List<User>>(serv.getall(),HttpStatus.OK);
	}
	
	@PutMapping("/details")
	public ResponseEntity<User> update(User user){
		User newuser=serv.update(user);
		   return new ResponseEntity<User>(newuser,HttpStatus.OK);
	}
	
	@DeleteMapping("/details")
	public ResponseEntity<?> delete(){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/details/{email}/{password}")
	public ResponseEntity<String> verify(@PathVariable("email") String email,@PathVariable("password") String password) {
		User user=null;
		
		
		if(email!=null && !"".equals(email)) {
			user=serv.findemail(email);
			if(user==null) {
				return new ResponseEntity<String>("Bad Credentials",HttpStatus.OK);
			}
			String temp=user.getPassword();
			
			
			if(password.equals(temp)) {
				return new ResponseEntity<String>(user.getType(),HttpStatus.OK);
			}
			else {
				return new ResponseEntity<String>("Invaild Username or Password",HttpStatus.OK);
			}
		}
		else {
			return new ResponseEntity<String>("Empty String Passed",HttpStatus.OK );
		}	
	
	}
     
	@GetMapping("/user/{email}")
	public ResponseEntity<String> typeofuser(@PathVariable("email") String email){
		User user=null;
		if(email!=null && !"".equals(email)) {
			user=serv.findemail(email);
			return new ResponseEntity<String>(user.getType(),HttpStatus.OK);
		}
		return new ResponseEntity<String>("invalid",HttpStatus.OK);
	}
	
	
	
}
