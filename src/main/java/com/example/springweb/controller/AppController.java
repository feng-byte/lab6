package com.example.springweb.controller;

import com.example.springweb.dao.AppUser;
import com.example.springweb.mapper.AppMapper;
import com.example.springweb.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;
import java.util.List;

@Controller
public class AppController {
    @Autowired
    AppService appService;
    public final static Logger logger = LoggerFactory.getLogger(AppController.class);


    @RequestMapping("/submit")
    public String submit()
    {
        return "submit";

    }

    @RequestMapping("/hand")
    public String hand(@RequestParam(value="name") String name, @RequestParam(value="class1",required = false) String class1, @RequestParam(value="class2",required = false) String class2, @RequestParam(value="class3",required = false) String class3, @RequestParam(value="level1",required = false) Integer level1, @RequestParam(value="level2",required = false) Integer level2, @RequestParam(value="level3",required = false) Integer level3, Model model)
    {
        AppUser OneUser=appService.SetOneAppUser(name,class1,class2,class3,level1,level2,level3);
        appService.InsertUser(OneUser);
        return "function";

    }

    @RequestMapping("/result")
    public String result(Model model) {
        List<AppUser> appList = appService.getUserList();
        model.addAttribute("appList", appList);
        return "result";
    }
}