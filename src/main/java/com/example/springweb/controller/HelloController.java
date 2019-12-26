package com.example.springweb.controller;

import com.example.springweb.dao.HelloUser;
import com.example.springweb.mapper.HelloMapper;
import com.example.springweb.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;
import java.util.List;

@Controller
public class HelloController {
    @Autowired
    HelloService helloService;
    public final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(String input_id,String input_pass,Model model){
        logger.info("hello logging" + helloService.getUserList());

        List<HelloUser> userList = helloService.getUserList();
        return "hello";
    }

    /*@RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(String name, String password, Model model) {
        //从页面之中提取输入的信息,并且封装好
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        //获取了页面的信息之后,就将信息发送到想要展示的页面
        logger.debug("name: " + name  + ", password: " + password);

        return "hello";
    }*/

    @RequestMapping("/check")
    public String check(@RequestParam(value="username") String name, @RequestParam(value="password",required = false) String password, Model model)
    {
        List<HelloUser> userList = helloService.getUserList();
        boolean result=helloService.CheckUser(name,password);

        //model.addAttribute("result", result);
        //model.addAttribute("name", name);
        //model.addAttribute("pass", password);
        if(result==true)
        {
            return "function";
        }
        else
        {

            return "hello";
        }

    }
/*
    @RequestMapping("/submit")
    public String submit()
    {
       return "submit";

    }

*/
}
