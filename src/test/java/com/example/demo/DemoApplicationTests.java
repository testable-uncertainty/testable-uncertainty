package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shouldBeNotEqualForOpenValueAnHiddenValue() {

		Factory factory = new Factory();
		Entity entity = factory.getInstance();
		Provider provider = new Provider();
		// get open value
		// get hidden value
		assertNotEquals(entity.get(), provider.askHidden(entity));

	}

	@Test
	void shouldBeEqualForActionValueAndActionHiddenValue () {
		Factory factory = new Factory();
		Entity entity = factory.getInstance();
		Action actionOfEntity = entity.act();
		// get open value
		// get hidden value
		ProviderB providerB = new ProviderB();
		System.out.println(providerB.askHidden(actionOfEntity));
		assertEquals(actionOfEntity.get(), providerB.askHidden(actionOfEntity));

	}

}
