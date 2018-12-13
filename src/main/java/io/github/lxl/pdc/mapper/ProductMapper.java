package io.github.lxl.pdc.mapper;

import io.github.lxl.pdc.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductMapper {
    public List<Category> categoryList();
}
