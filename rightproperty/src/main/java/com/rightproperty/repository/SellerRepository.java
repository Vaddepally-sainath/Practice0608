package com.rightproperty.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rightproperty.entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{
   
	
   @Query(value="Select * from Seller where sellerid=?1",nativeQuery = true)
   Seller Sellerbyid(int id);
   @Modifying
   @Transactional
   @Query(value="Delete from Seller where sellerid=?1",nativeQuery = true)
 void delete(int id);
}
