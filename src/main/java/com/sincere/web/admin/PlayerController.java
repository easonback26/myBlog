package com.sincere.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {

    @GetMapping("/")
    public String index() {
        int i = 9/0;
        return "index";
    }
}
