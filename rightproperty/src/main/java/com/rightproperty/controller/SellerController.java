package com.rightproperty.controller;

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

import com.rightproperty.beans.ResponseObject;
import com.rightproperty.entity.Land;
import com.rightproperty.entity.Seller;
import com.rightproperty.service.SellerServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/seller")
public class SellerController {
	
	@Autowired
	private final SellerServiceImpl serv;

	public SellerController(SellerServiceImpl serv) {
		super();
		this.serv = serv;
	}
    
	
	@PostMapping("/details")
	public ResponseEntity<String> add(@RequestBody Seller seller){
		
		Seller newSeller=serv.add(seller);
		ResponseObject n=new ResponseObject(newSeller.getFname(), "200 Ok");
		return new ResponseEntity<String>(n.toString(),HttpStatus.OK);
	}
	
	@GetMapping("/details/{id}")
	public ResponseEntity<Seller> get(@PathVariable("id") int id){
		return new ResponseEntity<Seller>(serv.getseller(id),HttpStatus.OK);
	}
	@DeleteMapping("details/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        serv.delete(id);
        return new ResponseEntity<String>("deleted",HttpStatus.OK);
    }
	 @PutMapping("/details/{id}")
	    public String updateland(@PathVariable int id,@RequestBody Seller seller) {
	    	String newland=serv.update(id,seller);
	    	return "Seller Updated";
	    }
}
