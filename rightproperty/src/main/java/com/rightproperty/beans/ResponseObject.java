package com.rightproperty.beans;



public class ResponseObject {

	
	@Override
	public String toString() {
		return   code + "\n " + message + "\t your data is in the database.";
	}
     
     String code; 
     String message;
     
	
     
     public ResponseObject(String message,String code) {
    	 this.code=code;
    	 this.message=message;
    	 
    	
             	 
     }
     
     public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
