package com.rightproperty.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.rightproperty.entity.Land;


@Repository
public interface LandRespository extends JpaRepository<Land, Integer>{
	
	@Query(value="Select * from Land where type=?1",nativeQuery = true )
	List<Land> getbytype(String type); 
	
	@Query(value="Select * from Land where featured=true", nativeQuery = true)
   List<Land> getbyfeatured(int featured); 
	
    @Query(value="Select * from Land where sellerid=?1",nativeQuery = true)
	 Land Landbyid(int id);
    @Modifying
    @Transactional
    @Query(value="Delete from Land where sellerid=?1",nativeQuery = true)
   void delete(int id);

	
    
}
