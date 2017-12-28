package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/28.
 */
@RestController
public class Controller {

    @RequestMapping(value = "user/hello")
    public String Hello(){
        System.out.println("helloworld");
        return "hello";
    }
}
