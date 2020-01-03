package com.ujiuye.controller;

import com.ujiuye.service.Responsebean;
import com.ujiuye.service.UserServeice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class Controller {
    @Autowired   //(@Autowired会自动找到自己的实现类)
            UserServeice serveice;

    @RequestMapping("he")
    public String  hello(){
        return "河南大学";
    }


    @RequestMapping("code")
    public Responsebean getCode(){

        return  serveice.createCode();
    }

}
