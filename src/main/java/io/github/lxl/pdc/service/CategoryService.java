package io.github.lxl.pdc.service;

import io.github.lxl.pdc.entity.Category;
import io.github.lxl.pdc.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Description:    产品品类业务层
* @Author:         lxl
* @CreateDate:     2018/12/11 13:30
* @UpdateUser:     lxl
* @UpdateDate:     2018/12/11 13:30
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    public int saveCategory(Category category) {
        categoryMapper.saveCategory( category);
        int num=category.getId();
        return num;
    }

    public Category queryCategory(int id) {
        return categoryMapper.queryCategory(id);
    }

    public int updateCategory(Category category) {
        return  categoryMapper.updateCategory(category);
    }

    public int deleteCategory(int id) {
        return categoryMapper.deleteCategory(id);
    }

    public List<Category> categoryList() {
        return categoryMapper.categoryList();
    }
}
