package product.spring.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product.spring.demo.entities.Category;
import product.spring.demo.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAllCategory();
	}

	@Override
	public Category getById(String id) {
		return categoryRepository.findCategoryById(Integer.parseInt(id));
	}

}
