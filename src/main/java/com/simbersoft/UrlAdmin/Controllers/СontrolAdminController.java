package com.simbersoft.UrlAdmin.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class СontrolAdminController {

    @GetMapping("/admin")
    public String urlAdmin (Model model) {
        return "control-admin";
    }
    @GetMapping("/admin/control-product")
    public String controlProduct (Model model) {
        return "control-product";
    }
    @GetMapping("/admin/control-category")
    public String controlCategory (Model model) {
        return "control-category";
    }

}
