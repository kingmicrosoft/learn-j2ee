package com.xgq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by XiaoChai on 3/28/16.
 */
@Controller
public class TestController {


    @RequestMapping(value = "/cain")
    @ResponseBody
    public String test(){

        return "ssss";
    }

    @RequestMapping(value = "/cain/page")

    public String testPage(){

        return "login";
    }
}
