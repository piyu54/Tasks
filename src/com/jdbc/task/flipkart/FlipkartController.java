package com.jdbc.task.flipkart;

public class FlipkartController {

	 public static void main(String[] args) throws Exception {

	        FlipkartService service = new FlipkartService();

//	        service.insertProduct();
	        service.fetchAllProducts();
//	        service.updateProduct();
//	        service.deleteProduct();
	    }
}
