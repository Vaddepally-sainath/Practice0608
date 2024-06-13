package com.rightproperty.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rightproperty.entity.User;
import com.rightproperty.repository.UserRepository;

@Service
public class ServiceImpl implements com.rightproperty.service.Service{
    @Autowired
	private final UserRepository repo;
    
	public ServiceImpl(UserRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public User add(User user) {
		
		
		
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		User newuser=repo.findById(user.getId()).orElse(null);
    	newuser.setFname(user.getFname());
    	newuser.setLname(user.getLname());
    	
    	newuser.setEmail(user.getEmail());
    	newuser.setGender(user.getGender());
    	newuser.setAddress(user.getAddress());
    	newuser.setCity(user.getCity());
    	newuser.setState(user.getState());
    	newuser.setPhone(user.getPhone());
    	newuser.setPassword(user.getPassword());
    	return repo.save(newuser);
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}

	@Override
	public void deletebyid(int id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}

	@Override
	public User findemail(String email) {
		// TODO Auto-generated method stub
		return repo.findbyemail(email);
	}

	
	
	

}
