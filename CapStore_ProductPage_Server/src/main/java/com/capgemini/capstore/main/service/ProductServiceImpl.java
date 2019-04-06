package com.capgemini.capstore.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capstore.main.beans.Cart;
import com.capgemini.capstore.main.beans.Customer;
import com.capgemini.capstore.main.beans.Merchant;
import com.capgemini.capstore.main.beans.Product;
import com.capgemini.capstore.main.dao.CapStoreCart;
import com.capgemini.capstore.main.dao.CapStoreCustomer;
import com.capgemini.capstore.main.dao.CapStoreMerchant;
import com.capgemini.capstore.main.dao.CapStoreProduct;

@Service
public class ProductServiceImpl implements ProductService
{
	
	@Autowired
	CapStoreCart repo;
	
	@Autowired
	CapStoreProduct repoprod;
	@Autowired
	CapStoreCustomer repocust;
	@Autowired
	CapStoreMerchant repomer;
	
	@Override
	public void createProduct(Product product)
	{		
			repoprod.save(product);
	}

	@Override
	public Product showProduct(int productId)
	{		
		return repoprod.findById(productId).get();
	}

	@Override
	public List<Product> showAllProduct() {
		return repoprod.findAll();
	}
	
	@Override
	public Product addCartItem(int pid, int custid,int merid) {
		Product product = repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		Merchant merchant=repomer.getOne(merid);
		Cart cart=new Cart();
		cart.setCustomer(customer);
		cart.setMerchant(merchant);
		cart.setProduct(product);
		cart.setSoftDelete("A");
		cart.setProductPrice(product.getProductPrice());
		cart.setQuantity(cart.getQuantity() + 1);
		repo.save(cart);
		return product;

	}

	@Override
	public Product removeCartItem(int pid, int custid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> viewCart(int custid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean minAmountCheck(int custid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
