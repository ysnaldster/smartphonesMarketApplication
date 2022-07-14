package com.app.smartphonesMarketApplication;

import com.app.smartphonesMarketApplication.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartphonesMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartphonesMarketApplication.class, args);

		Customer myCustomer = new Customer("Ysnaldo", "ys@mail.com");
		System.out.println(myCustomer);
		System.out.println("Your name is " + myCustomer.getName());
		System.out.println("Hola mundo");
	}

}
