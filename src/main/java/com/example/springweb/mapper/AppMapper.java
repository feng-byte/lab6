package com.example.springweb.mapper;

import com.example.springweb.dao.AppUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AppMapper {
    @Select("select * from app ")
    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "class_1", column = "class1"),
            @Result(property = "class_2", column = "class2"),
            @Result(property = "class_3", column = "class3"),
            @Result(property = "level_1", column = "level1"),
            @Result(property = "level_2", column = "level2"),
            @Result(property = "level_3", column = "level3")
    })
    List<AppUser> findAll();

    @Insert("insert into app(name,class1,class2,class3,level1,level2,level3) values(#{name},#{class_1},#{class_2},#{class_3},#{level_1},#{level_2},#{level_3})")
    void insert(AppUser appUser);

    @Select("select * from app where name = #{name}")
    @Results({
            @Result(property = "name",column = "name"),
            @Result(property = "class_1", column = "class1"),
            @Result(property = "class_2", column = "class2"),
            @Result(property = "class_3", column = "class3"),
            @Result(property = "level_1", column = "level1"),
            @Result(property = "level_2", column = "level2"),
            @Result(property = "level_3", column = "level3")
    })
    AppUser getOne(String name);

    @Update("update app set name = #{name}, class1 = #{class_1}, class2 = #{class_2}, class3 = #{class_3}, level1 = #{level_1}, level2 = #{level_2}, level3 = #{level_3}, where name = #{name}")
    void updateByID(AppUser appUser);//UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值

    @Delete("delete from app where name = #{name}")
    void deleteByName(String name);//DELETE FROM 表名称 WHERE 列名称 = 值
}

