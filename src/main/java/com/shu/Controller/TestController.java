package com.shu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
public class TestController{

    @RequestMapping("/")
    public String jenkins()
    {
        return "news";
    }
}