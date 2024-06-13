package com.rightproperty.repository;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.rightproperty.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {
	
	@Modifying
	 @Transactional
	 @Query(value="Delete from User where id=?1",nativeQuery = true)
	 public void delete(int id);
	
	@Query(value="Select * from User where id=?1",nativeQuery = true)
	User findbyId(int id);
     
	@Query(value="Select * from User where email=?1",nativeQuery = true)
	User findbyemail(String email);
    
	
    
}
