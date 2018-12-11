package io.github.lxl.pdc.controller;

import io.github.lxl.pdc.entity.Manager;
import io.github.lxl.pdc.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: ManagerController
 * @Author: lxl
 * @CreateDate: 2018/12/10 14:55
 * @UpdateUser: lxl
 * @UpdateDate: 2018/12/10 14:55
 * @UpdateRemark:
 * @Version: 1.0
 */
@RestController
@RequestMapping("/v1/pdc/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping()
    public int saveManager(Manager manager) {
        System.out.println("参数" + manager.toString());

        int id = managerService.saveManager(manager);
        System.out.println("id=" + id);
        System.out.println(" " + manager.getId());
        return id;
    }

    @GetMapping(value = "/{id}")
    public String queryManager(@PathVariable int id) {
        return managerService.getManager(id).toString();
    }

    @PutMapping(value = "/{id}")
    public int updateManager(Manager manager) {
        int mid = managerService.updateManage(manager);
        return mid;
    }


    @DeleteMapping(value = "/{id}")
    public int deleteManager(@PathVariable int id) {
        return managerService.deleteManager(id);
    }


}
