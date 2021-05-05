package com.example.test.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijinquan
 * @description
 * @time 2021/5/5 20:56
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){

        return "success";
    }
}
