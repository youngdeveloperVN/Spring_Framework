package com.demo.converter;

import com.demo.entities.Category;
import com.demo.entities.Product;
import com.demo.vo.CategoryVo;
import com.demo.vo.ProductVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    ProductVo productToProductVo(Product product);

    Product productVoToProduct(ProductVo vo);

    List<ProductVo> toProductDtos(List<Product> products);

    List<Product> toProduct(List<ProductVo> vos);

    CategoryVo categoryToCategoryVo(Category entity);

    Category toCategory(CategoryVo dto);

    List<CategoryVo> toCategoryDtos(List<Category> entities);

    List<Category> toCategories(List<CategoryVo> vos);

}
