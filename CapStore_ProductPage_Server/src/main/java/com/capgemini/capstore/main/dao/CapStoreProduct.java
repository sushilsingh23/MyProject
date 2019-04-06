package com.capgemini.capstore.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.main.beans.Product;

@Repository
public interface CapStoreProduct extends JpaRepository<Product, Integer>{

}
