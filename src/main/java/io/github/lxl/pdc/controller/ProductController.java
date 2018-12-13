package io.github.lxl.pdc.controller;

import io.github.lxl.pdc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/v1/pdc/product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    public Object  categoryList(){
        return  productService.categoryList();
    }
}
