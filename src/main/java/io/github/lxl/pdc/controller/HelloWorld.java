package io.github.lxl.pdc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorld
 * @Description TODO
 * @Author cl
 * @Date 2018/12/8 下午1:23
 **/
@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello lxl";
    }


}
