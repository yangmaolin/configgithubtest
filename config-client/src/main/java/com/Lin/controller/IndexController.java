package com.Lin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${what}")
    private String label;

    @RequestMapping("/hello")
    public String test() {
        return label;
    }
}
