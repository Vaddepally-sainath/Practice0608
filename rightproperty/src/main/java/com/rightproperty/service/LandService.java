package com.rightproperty.service;

import java.util.List;

import com.rightproperty.entity.Land;

public interface LandService {
	
	Land add(Land lan);
    List<Land> gettype(String type);
    List<Land> getfeature(int featured);
    List<Land> getall();
    Land get(int id);
    List<Land> getalllandswithpagination(int pageNo,int pageSize);
    void delete(int id);
}
