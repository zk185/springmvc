package cn.piesat.springmvc.controller;

import cn.piesat.springmvc.commons.Response;
import cn.piesat.springmvc.entity.TUser;
import cn.piesat.springmvc.service.ITest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITest iTest;

    @RequestMapping("/testMathod")
    @ResponseBody
    public Response test(@RequestBody String json){
        JSONObject obj = JSON.parseObject(json);
        Response r = Response.getInstance();
        Integer id = obj.getInteger("id");

        TUser tUser = iTest.test(id);
        if(tUser != null){
            r.setOk(10000,null,"查询成功！",tUser);
        }else{
            r.setError(0,null,"查询失败！");
        }
        return r;
    }
}
