package com.seikei.shiroexample.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @RequestMapping("/admin/page")
    public String admin() {
        return "admin page";
    }

    @RequestMapping("/admin/index")
    public String adminIndex() {
        return "admin index";
    }


}
