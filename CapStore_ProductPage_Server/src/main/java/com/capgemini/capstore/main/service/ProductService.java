package com.capgemini.capstore.main.service;

import java.util.List;

import com.capgemini.capstore.main.beans.Product;

public interface ProductService
{
	public void createProduct(Product product);
	public Product showProduct (int productId);
	public List<Product> showAllProduct();
	
	Product addCartItem(int pid, int custid,int merid);
	Product removeCartItem(int pid, int custid);	List<Product> viewCart(int custid);
	Boolean minAmountCheck(int custid);
}
