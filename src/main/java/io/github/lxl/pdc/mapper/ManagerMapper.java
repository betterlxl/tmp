package io.github.lxl.pdc.mapper;

import io.github.lxl.pdc.entity.Manager;
import org.springframework.stereotype.Repository;

/**
 * @Description: mapper
 * @Author: lxl
 * @CreateDate: 2018/12/10 14:54
 * @UpdateUser: lxl
 * @UpdateDate: 2018/12/10 14:54
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Repository
public interface ManagerMapper {
    Manager getManager(int id);

    int saveManger(Manager manager);

    int updateManager(int id);

    int deleteManager(int id);
}
