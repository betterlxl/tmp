package io.github.lxl.pdc.controller;

import io.github.lxl.pdc.entity.Manager;
import io.github.lxl.pdc.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
@RequestMapping("/v1/pdc")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping(value = "/manager")
    public int saveManager(Manager manager) {
        return managerService.saveManager(manager);
    }

    @GetMapping(value = "/{id}")
    public String QueryManager(@PathVariable int id) {
        return managerService.getManager(id).toString();
    }

    @PutMapping(value = "/{id}")
    public int updateManager(@PathVariable int id) {
        return managerService.updateManage(id);

    }

    @DeleteMapping(value = "/{id}")
    public int deleteManager(@PathVariable int id) {
        return managerService.deleteManager(id);

    }


}
