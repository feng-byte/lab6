package com.example.springweb;

import com.example.springweb.dao.AppUser;
import com.example.springweb.service.AppService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppServiceTest {
    @Autowired
    AppService appService;

    @Test
    public void testUsers() {
        AppUser user1 = new AppUser();
        user1.setName("工业APP3");
        user1.setClass_1("111");
        user1.setClass_2("222");
        user1.setClass_3("333");
        user1.setLevel_1(1);
        user1.setLevel_2(2);
        user1.setLevel_3(3);


        appService.InsertUser(user1);
        appService.getOne("工业APP3");

        appService.DeleteByName("工业APP3");

        AppUser user2 = new AppUser();
        user2.setName("工业APP4");
        user2.setClass_1("1112");
        user2.setClass_2("2222");
        user2.setClass_3("3332");
        user2.setLevel_1(3);
        user2.setLevel_2(2);
        user2.setLevel_3(1);
        appService.InsertUser(user2);
        appService.getOne("工业APP4");
        appService.getOne("工业APP5");
    }
}
