package com.capgemini.capstore.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.main.beans.ProductFeedback;

public interface CapStoreProductFeedback extends JpaRepository<ProductFeedback, Integer>{

}
