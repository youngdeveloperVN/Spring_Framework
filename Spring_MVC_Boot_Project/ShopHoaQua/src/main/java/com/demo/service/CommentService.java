package com.demo.service;

import com.demo.vo.ProductVo;

import java.util.List;

public interface CommentService {
    List<ProductVo> findAll();
    ProductVo findById(String id);
    ProductVo create(ProductVo vo);
    ProductVo update(ProductVo vo);
    Boolean delete(String id);
}
