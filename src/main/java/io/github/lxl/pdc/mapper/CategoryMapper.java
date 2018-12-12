package io.github.lxl.pdc.mapper;

import io.github.lxl.pdc.entity.Category;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
* @Description:    产品品类接口
* @Author:         lxl
* @CreateDate:     2018/12/11 13:29
* @UpdateUser:     lxl
* @UpdateDate:     2018/12/11 13:29
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Repository
public interface CategoryMapper extends BaseMapper {

    int saveCategory(Category category);

    Category queryCategory(int id);

    int updateCategory(Category category);

    int deleteCategory(int id);

    List<Category> categoryList();
}
