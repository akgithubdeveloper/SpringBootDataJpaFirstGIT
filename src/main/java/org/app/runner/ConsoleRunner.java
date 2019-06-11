package org.app.runner;

import org.app.model.Product;
import org.app.reposi.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(repo.getClass().getName());
		Product p=repo.save(new Product("A",2.3));
		System.out.println(p.getProdId());
		repo.save(new Product("B",3.3));
		repo.save(new Product("C",3.6));


	}

}
