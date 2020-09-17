package com.demo.converter;

import com.demo.entities.Category;
import com.demo.entities.Product;
import com.demo.vo.CategoryVo;
import com.demo.vo.ProductVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    List<ProductVo> toDtos(List<Product> products);

    List<Product> toProduct(List<ProductVo> vos);

    ProductVo productToProductVo(Product product);

    Product toProductCreate(ProductVo vo);

    //Product toProductUpdate(ProductVo vo);

    CategoryVo categoryToCategoryVo(Category entity);

    Category categoryVoTcCategory(CategoryVo dto);


}
