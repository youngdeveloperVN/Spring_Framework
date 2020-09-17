package product.spring.demo.services;

import java.util.List;

import product.spring.demo.entities.Product;

public interface ProductService {

	List<Product> getAllProducts();
	Product getById(String id);
}
