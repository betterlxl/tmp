package io.github.lxl.pdc.service;

import io.github.lxl.pdc.entity.Category;
import io.github.lxl.pdc.entity.Manager;
import io.github.lxl.pdc.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 业务层
 * @Author: lxl
 * @CreateDate: 2018/12/10 14:54
 * @UpdateUser: lxl
 * @UpdateDate: 2018/12/10 14:54
 * @UpdateRemark:
 * @Version: 1.0
 */
@Service
public class ManagerService {
    @Autowired
    ManagerMapper managerMapper;

    public Manager getManager(int id) {
        return managerMapper.getManager(id);
    }

    public int saveManager(Manager manager) {
        managerMapper.saveManger(manager);
        int num = manager.getId();
        return  num;

    }

    public int updateManage(Manager manager) {
        int num = managerMapper.updateManager(manager);
        return num;
    }

    public int deleteManager(int id) {
        int num = managerMapper.deleteManager(id);
        return num;
    }
    public List<Manager> managerList(){
        return managerMapper.selectList();
    }
}
