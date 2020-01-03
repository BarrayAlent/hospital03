package com.ujiuye.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //路经
    @RequestMapping("/he")
    public String hello(){
        return "汤承翰";
    }
}
