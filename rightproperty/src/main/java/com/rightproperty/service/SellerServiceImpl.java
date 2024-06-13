package com.rightproperty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rightproperty.entity.Land;
import com.rightproperty.entity.Seller;
import com.rightproperty.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService{
    @Autowired
	private final SellerRepository repo;

	public SellerServiceImpl(SellerRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Seller add(Seller seller) {
		// TODO Auto-generated method stub
		return repo.save(seller);
	}

	@Override
	public Seller getseller(int id) {
		// TODO Auto-generated method stub
		return repo.Sellerbyid(id) ;
	}

	@Override
	public void delete(int id) {
		repo.delete(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public String update(int id, Seller seller) {
		Seller sell=repo.findById(id).get();
		sell.setEmail(seller.getEmail());
		sell.setFname(seller.getFname());
		sell.setLname(seller.getLname());
		sell.setPhone(seller.getPhone());
		sell.setSellerid(seller.getSellerid());
		repo.save(seller);
		// TODO Auto-generated method stub
		return "seller updated";
	}
	
	

}
