package com.jdbc.task.flipkart;

public class FlipkartService {

	public void insertProduct() throws Exception {
		FlipkartDao dao = new FlipkartDao();
        dao.insertProduct();
		
	}

	 public void fetchAllProducts() throws Exception {
	        FlipkartDao dao = new FlipkartDao();
	        dao.fetchAllProducts();
	    }

	    public void updateProduct() throws Exception {
	        FlipkartDao dao = new FlipkartDao();
	        dao.updateProduct();
	    }

	    public void deleteProduct() throws Exception {
	        FlipkartDao dao = new FlipkartDao();
	        dao.deleteProduct();
	    }
	

}
