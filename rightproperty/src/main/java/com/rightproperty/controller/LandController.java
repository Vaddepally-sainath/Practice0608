package com.rightproperty.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.ThrowsAdvice;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rightproperty.beans.ResponseObject;
import com.rightproperty.entity.Land;
import com.rightproperty.repository.LandRespository;
import com.rightproperty.service.LandServiceImpl;


@RestController
@RequestMapping("/land")
@CrossOrigin(origins="http://localhost:4200")
public class LandController {
	@Autowired
	public LandController(LandServiceImpl serv) {
		super();
		this.serv = serv;
		
	}

	private final LandServiceImpl serv;
	
	
	
	


	@PostMapping("/details")
	public ResponseEntity<String> add(@RequestBody Land lan){
		
		Land newland=serv.add(lan);
		
		ResponseObject n=new ResponseObject(newland.getType() ,"200 Ok");
		return new ResponseEntity<String>(n.toString(),HttpStatus.OK);
		  
	}
//    @DeleteMapping("/details/{id}")
//    public String deleteland(@PathVariable int id) {
//    	return serv.deleteland(id);
//    }
   
    
	
	@GetMapping("/details/type/{type}")
	public ResponseEntity<List<Land>> getbytype(@PathVariable("type") String type){
		List<Land> newland=serv.gettype(type);
		return new ResponseEntity<List<Land>>(newland,HttpStatus.OK);
	}
	
	@GetMapping("/details/{feature}")
	public ResponseEntity<List<Land>> getbytype(@PathVariable("feature") int feature){
		List<Land> newland=serv.getfeature(1);
		return new ResponseEntity<List<Land>>(newland,HttpStatus.OK);
	}
	
	@GetMapping("/details")
	public ResponseEntity<List<Land>> getall(){
		return new ResponseEntity<List<Land>>(serv.getall(),HttpStatus.OK);
		
	}
	@GetMapping("/dets/{id}")
	public ResponseEntity<Land> get(@PathVariable("id") int id){
		Land land=serv.get(id);
		return new ResponseEntity<Land>(land,HttpStatus.OK);
	}
	@DeleteMapping("details/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        serv.delete(id);
        return new ResponseEntity<String>("Deleted Succesfully",HttpStatus.OK);
    }
	@GetMapping("getallwithpagination")
	public List<LandRespository> getalllandwithpagination(@RequestParam int pageNo,@RequestParam int pageSize){
		List<Land> landlist=serv.getalllandswithpagination(pageNo, pageSize);
		List<LandRespository> landresponseList= new ArrayList<LandRespository>();
		landlist.stream().forEach(Land->{
//			landresponseList.add(new LandRespository(Land));	
		});
		return landresponseList;
	}
}
