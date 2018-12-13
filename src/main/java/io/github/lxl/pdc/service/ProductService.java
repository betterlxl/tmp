package io.github.lxl.pdc.service;

import io.github.lxl.pdc.entity.Category;
import io.github.lxl.pdc.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;
    public List<Category> categoryList() {
        return productMapper.categoryList();
    }
}
