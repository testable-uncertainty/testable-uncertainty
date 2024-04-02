package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Factory factory = new Factory();
		Entity entity = factory.getInstance();

		// get open value
		System.out.println(entity.get());

		// get hidden value
		Provider provider = new Provider();
		System.out.println(provider.askHidden(entity));

		Action actionOfEntity = entity.act();

		// get open value
		System.out.println(actionOfEntity.get());

		// get hidden value
		ProviderB providerB = new ProviderB();
		System.out.println(providerB.askHidden(actionOfEntity));


	}

}
