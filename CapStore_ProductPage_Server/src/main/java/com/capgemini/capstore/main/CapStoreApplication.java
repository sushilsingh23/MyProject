package com.capgemini.capstore.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.capgemini.capstore.main.beans")
public class CapStoreApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(CapStoreApplication.class, args);
	}
}
