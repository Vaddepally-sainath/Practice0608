package com.rightproperty.service;


import java.util.List;

import com.rightproperty.entity.User;

public interface Service {
	
	User add(User user);
    List<User> getall();
    User update(User user);
    void delete();
    void deletebyid(int id);
    User findemail(String email);
   
}
