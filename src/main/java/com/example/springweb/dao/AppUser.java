package com.example.springweb.dao;

import java.io.Serializable;

public class AppUser implements Serializable {
    private String name;
    private String class_1;
    private String class_2;
    private String class_3;
    private Integer level_1;
    private Integer level_2;
    private Integer level_3;

    public AppUser(){
        name = null;
        class_1 = null;
        class_2 = null;
        class_3 = null;
        level_1 = 0;
        level_2 = 0;
        level_3 = 0;
    }
    public AppUser(String name,String class_1,String class_2,String class_3,Integer level_1,Integer level_2,Integer level_3){

        this.name=name;
        this.class_1=class_1;
        this.class_2=class_2;
        this.class_3=class_3;
        this.level_1=level_1;
        this.level_2=level_2;
        this.level_3=level_3;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_1() {
        return class_1;
    }
    public String getClass_2() {
        return class_2;
    }
    public String getClass_3() {
        return class_3;
    }
    public Integer getLevel_1() {
        return level_1;
    }
    public Integer getLevel_2() {
        return level_2;
    }
    public Integer getLevel_3() {
        return level_3;
    }

    public void setClass_1(String class_1) {
        this.class_1 = class_1;
    }

    public void setClass_2(String class_2) {
        this.class_2 = class_2;
    }

    public void setClass_3(String class_3) {
        this.class_3 = class_3;
    }

    public void setLevel_1(int level_1) {
        this.level_1 = level_1;
    }
    public void setLevel_2(int level_2) {
        this.level_2 = level_2;
    }
    public void setLevel_3(int level_3) {
        this.level_3 = level_3;
    }

    @Override
    public String toString() {
        return  name + "," + class_1 + "," + class_2 + "," + class_3 + "," + (char)(level_1+'0') + "," + (char)(level_2+'0') + "," + (char)(level_3+'0');
    }
}
