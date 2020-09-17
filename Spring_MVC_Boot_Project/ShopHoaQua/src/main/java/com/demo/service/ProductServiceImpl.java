package com.demo.service;

import com.demo.converter.ProductMapper;
import com.demo.entities.Product;
import com.demo.repository.ProductRepository;
import com.demo.vo.ProductVo;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    private ProductMapper productMapper = ProductMapper.INSTANCE;

    @Override
    public List<ProductVo> findAll() {
        List<Product> listProducs = productRepository.findAll();
        List<ProductVo> listProducVos = productMapper.toDtos(listProducs);
        return listProducVos;
    }

    @Override
    public ProductVo findById(String id) {
        Optional<Product> product = productRepository.findById(Integer.parseInt(id));
        if (product.isPresent()) {
            Product productOut = product.get();
            return productMapper.productToProductVo(productOut);
        }
        return null;
    }

    @Override
    public ProductVo create(ProductVo vo) {
        Product product = productMapper.toProductCreate(vo);
        product = productRepository.save(product);
        vo.setId(product.getId());
        return vo;
    }

    @Override
    public ProductVo update(ProductVo vo) {
        Optional<Product> product = productRepository.findById(vo.getId());
        if (product.isPresent()) {
            Product productToSave = product.get();
            productToSave = productMapper.toProductCreate(vo);
            productRepository.save(productToSave);
        }
        return vo;
    }

    @Override
    public Boolean delete(String id) {
        Optional<Product> product = productRepository.findById(Integer.parseInt(id));
        if (product.isPresent()) {
            productRepository.delete(product.get());
        }
        return Boolean.TRUE;
    }
}
