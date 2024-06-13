package com.rightproperty.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

import com.rightproperty.entity.Land;
import com.rightproperty.repository.LandRespository;

@Service
public class LandServiceImpl implements LandService{
    @Autowired
    private final LandRespository repo;
    
    
	
	@Autowired
	public LandServiceImpl(LandRespository repo) {
		super();
		this.repo = repo;
	}




	public Land add(Land lan) {
		return repo.save(lan);
	}




	@Override
	public List<Land> gettype(String type) {
		// TODO Auto-generated method stub
		return repo.getbytype(type);
	}




	@Override
	public List<Land> getfeature(int featured) {
		// TODO Auto-generated method stub
		return repo.getbyfeatured(featured);
	}




	@Override
	public List<Land> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}




	@Override
	public Land get(int id) {
		// TODO Auto-generated method stub
		return repo.Landbyid(id);
	}




	



//
//	@Override
//	public String upadateland(int id, Land lan) {
//		
//		Land land=repo.findById(id).get();
//		land.setAddress(lan.getAddress());
//		land.setArea(lan.getArea());
//		land.setCity(lan.getCity());
//		land.setFeatured(lan.getFeatured());
//		land.setImageurl(lan.getImageurl());
//		land.setPrice(lan.getPrice());
//		land.setSellerid(lan.getSellerid());
//		land.setState(lan.getState());
//		land.setType(lan.getType());
//		 repo.save(land);
//		return "Land Updated";
//		 
//		// TODO Auto-generated method stub
//		
//	}



@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}




@Override
public List<Land> getalllandswithpagination(int pageNo, int pageSize) {
	// TODO Auto-generated method stub
	PageRequest pageable=PageRequest.of(pageNo-1,pageSize);
	return repo.findAll(pageable).getContent();
}









	



	
	
	

}
