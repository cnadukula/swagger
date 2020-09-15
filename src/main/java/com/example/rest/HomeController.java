package com.example.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path = "/")
    public String swagger() {
        return "redirect:/swagger-ui.html";
    }

    @GetMapping(path = "/info")
    public String info() {
        return "redirect:/actuator/info";
    }

    @GetMapping(path = "/health")
    public String health() {
        return "forward:/actuator/health";
    }

}
