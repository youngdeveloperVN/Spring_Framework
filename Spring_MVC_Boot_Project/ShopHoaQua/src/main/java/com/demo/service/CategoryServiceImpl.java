package com.demo.service;

import com.demo.converter.CategoryMapper;
import com.demo.entities.Category;
import com.demo.repository.CategoryRepository;
import com.demo.vo.CategoryVo;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    private CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Override
    public List<CategoryVo> findAll() {
        List<Category> listProducs = categoryRepository.findAll();
        List<CategoryVo> listProducVos = categoryMapper.toCategoryDtos(listProducs);
        return listProducVos;
    }

    @Override
    public CategoryVo findById(Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            return categoryMapper.categoryToCategoryVo(category.get());
        }
        return null;
    }

    @Override
    public CategoryVo create(CategoryVo vo) {
        Category category = categoryMapper.toCategory(vo);
        category = categoryRepository.save(category);
        vo.setId(category.getId());
        return vo;
    }

    @Override
    public CategoryVo update(CategoryVo vo) {
        Optional<Category> category = categoryRepository.findById(vo.getId());
        if (category.isPresent()) {
            Category categoryToSave = category.get();
            categoryToSave = categoryMapper.toCategory(vo);
            categoryRepository.save(categoryToSave);
        }
        return vo;
    }

    @Override
    public Boolean delete(Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            categoryRepository.delete(category.get());
        }
        return Boolean.TRUE;
    }
}
