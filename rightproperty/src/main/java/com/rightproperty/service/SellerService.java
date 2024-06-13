package com.rightproperty.service;

import com.rightproperty.entity.Land;
import com.rightproperty.entity.Seller;

public interface SellerService {
   Seller add(Seller seller);
   
   Seller getseller(int id);
   void delete(int id);
   String update(int id,Seller seller);
}
