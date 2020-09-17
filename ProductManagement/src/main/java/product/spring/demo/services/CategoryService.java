package product.spring.demo.services;

import java.util.List;

import product.spring.demo.entities.Category;

public interface CategoryService {
	
	List<Category> getAllCategories();
	Category getById(String id);
}
