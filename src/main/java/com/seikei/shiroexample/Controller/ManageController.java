package com.seikei.shiroexample.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("manage")
public class ManageController {
    @RequestMapping("/index")
    public String manage() {
        return "manage page";
    }

    @RequestMapping("/{name}")
    public String manageName(@PathVariable String name) {
        return "manage: "+name;
    }

    @RequestMapping("/page/index")
    public String managePageIndex() {
        String hello = "hello manager";
        return hello;
    }
}
