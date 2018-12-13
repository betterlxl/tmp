package io.github.lxl.pdc.controller;

import io.github.lxl.pdc.entity.Category;
import io.github.lxl.pdc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 产品品类
 * @Author: lxl
 * @CreateDate: 2018/12/11 13:29
 * @UpdateUser: lxl
 * @UpdateDate: 2018/12/11 13:29
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RequestMapping("/v1/pdc/category")
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PutMapping()
    public int saveCategory(Category category) {
        System.out.println("参数" + category.toString());
        int id = categoryService.saveCategory(category);
        System.out.println("id=" + id);
        System.out.println(" " + category.getId());
        return id;
    }
    @GetMapping()
    public Object categoryList(){
        return  categoryService.categoryList();
    }

    @GetMapping("/{id}")
    public String queryCategory(@PathVariable int id) {
        return categoryService.queryCategory(id).toString();
    }

    @PostMapping("/{id}")
    public int updateCategory(Category category){
        return  categoryService.updateCategory(category);
    }

    @DeleteMapping("/{id}")
    public int deleteCategory(int id){
        return categoryService.deleteCategory(id);
    }

    @GetMapping("/list/{id}")
    public Object queryProductListByCategory(@PathVariable("id") int id){
        return  categoryService.queryProductByCategory(id);
    }
}
