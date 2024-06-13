package com.rightproperty.service;

import org.springframework.stereotype.Repository;

@Repository
public interface UserService {

	public int Login(String username,String password);

}
