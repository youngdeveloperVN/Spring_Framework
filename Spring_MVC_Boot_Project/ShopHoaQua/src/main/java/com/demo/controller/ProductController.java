package com.demo.controller;

import com.demo.service.ProductService;
import com.demo.vo.BooleanVo;
import com.demo.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    public List<ProductVo> getAll() {
        return productService.findAll();
    }

    @GetMapping(value = "/product/{id}")
    public ProductVo getDetail(@PathVariable String id) {
        return productService.findById(id);
    }

    @PostMapping(value = "/product")
    public ProductVo createNewProduct(@RequestBody ProductVo vo) {
        return productService.create(vo);
    }

    @PutMapping(value = "/product")
    public ProductVo updateProduct(@RequestBody ProductVo vo) {
        return productService.update(vo);
    }

    @DeleteMapping(value = "/product/{id}")
    public BooleanVo delete(@PathVariable String id) {
        BooleanVo vo = new BooleanVo();
        vo.setStatus(productService.delete(id));
        return vo;
    }
}
