package com.demo.controller;

import com.demo.service.CategoryService;
import com.demo.service.ProductService;
import com.demo.vo.BooleanVo;
import com.demo.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/categories")
    public ModelAndView getAll() {
        ModelAndView m = new ModelAndView();
        m.addObject("list", categoryService.findAll());
        m.setViewName("admin/category/list");
        return m;
    }

    @GetMapping(value = "/category/{id}")
    public ModelAndView getDetail(@PathVariable Integer id) {
        ModelAndView m = new ModelAndView();
        m.addObject("list", categoryService.findById(id));
        m.setViewName("admin/category/detail");
        return m;
    }

    @PostMapping(value = "/category")
    public ModelAndView createNewProduct(@RequestBody CategoryVo vo) {
        ModelAndView m = new ModelAndView();
        m.addObject("list", categoryService.create(vo));
        m.setViewName("admin/category/detail");
        return m;
    }

    @PutMapping(value = "/category")
    public CategoryVo updateProduct(@RequestBody CategoryVo vo) {
        return categoryService.update(vo);
    }

    @DeleteMapping(value = "/category/{id}")
    public BooleanVo delete(@PathVariable Integer id) {
        BooleanVo vo = new BooleanVo();
        vo.setStatus(categoryService.delete(id));
        return vo;
    }
}
