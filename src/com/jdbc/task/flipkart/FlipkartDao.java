package com.jdbc.task.flipkart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FlipkartDao {

	public void insertProduct() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart_db", "root", "root");

		Statement s = con.createStatement();

		int c = s.executeUpdate(
				"insert INTO product(product_name, product_price, product_stock) VALUES ('Iphone 15', 80000, 10),('Laptop HP', 55000, 5),('Headphones', 2000, 20)");

		if (c > 0) {
			System.out.println("Products Inserted");
		} else {
			System.out.println("Insert Failed");
		}

		con.close();
	}

	public void fetchAllProducts() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart_db", "root", "root");

		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM product");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getInt(4));
		}

		con.close();
	}

	public void updateProduct() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart_bd", "root", "root");

		Statement s = con.createStatement();

		int c = s.executeUpdate("update product SET product_price = 75000 WHERE product_id = 1");

		if (c > 0) {
			System.out.println("Product Updated");
		}

		con.close();
	}

	public void deleteProduct() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart_db", "root", "root");

		Statement s = con.createStatement();

		int c = s.executeUpdate("DELETE FROM product WHERE product_id = 3");

		if (c > 0) {
			System.out.println("Product Deleted");
		}

		con.close();
	}
}
