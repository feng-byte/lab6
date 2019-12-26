package com.example.springweb.service;

import com.example.springweb.dao.AppUser;
import com.example.springweb.mapper.AppMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class AppService {
    @Resource
    private AppMapper appMapper;

    public List<AppUser> getUserList() {
        List<AppUser> list = appMapper.findAll();
        return list;
    }




    /*public void InsertUser(HelloUser helloUser){
        helloMapper.insert(helloUser);
        System.out.println("Afterinsert:"+helloMapper.findAll());
    }*/
    public void InsertUser(AppUser appUser){

        appMapper.insert(appUser);
    }


    public AppUser getOne(String name){
        //HelloUser result = new HelloUser();
        AppUser result = appMapper.getOne(name);
        System.out.println("getOne:"+result);
        if (result==null)
        {
            result=new AppUser();//索引为空的时候，返回null，需要这时候对其getId,getName就会出错。
        }
        System.out.println(result.toString());
        return result;
    }

    /*public void UpdateByID(HelloUser helloUser){
        helloMapper.updateByID(helloUser);
        System.out.println("AfterUpdate:"+ helloMapper.getOne(helloUser.getId()));
    }*/

    /*
    public void UpdateByName(Map<String, String> params){
        String id = params.get("id");
        //Long recordId = Long.parseLong(params.get("recordId"));
        //ObjectMapper objectMapper = new ObjectMapper();
        //HelloUser helloUser = objectMapper.convertValue(params, HelloUser.class);
        //helloMapper.updateByID(helloUser);
        HelloUser temp = helloMapper.getOne(id);
        if(params.get("name")!=null)
            temp.setName(params.get("name"));
        if(params.get("password")!=null)
            temp.setPassword((params.get("password")));
        helloMapper.updateByID(temp);
    }*/
    //暂时没有更新功能


    public void DeleteByName(String name){
        appMapper.deleteByName(name);
        System.out.println("AfterDelete:"+appMapper.getOne(name));
    }

    public AppUser SetOneAppUser(String name,String class1,String class2,String class3,Integer level1,Integer level2,Integer level3)
    {
        AppUser OneUser=new AppUser(name,class1,class2,class3,level1,level2,level3);
        return OneUser;
    }

}
