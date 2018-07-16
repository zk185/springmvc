package cn.piesat.springmvc.controller;

import cn.piesat.springmvc.service.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITest iTest;

    @RequestMapping("/testMathod")
    @ResponseBody
    public String test(){
        String s = iTest.test();
        return s;
    }
}
