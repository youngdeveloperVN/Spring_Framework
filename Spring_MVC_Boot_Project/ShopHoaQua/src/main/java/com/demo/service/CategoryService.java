package com.demo.service;

import com.demo.vo.CategoryVo;
import com.demo.vo.ProductVo;

import java.util.List;

public interface CategoryService {

    List<CategoryVo> findAll();
    CategoryVo findById(Integer id);
    CategoryVo create(CategoryVo vo);
    CategoryVo update(CategoryVo vo);
    Boolean delete(Integer id);
}
