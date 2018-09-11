package com.example.demo.dao;

import com.example.demo.model.Customer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AnnoCustomerMapper {

//    @Insert({"insert customer(id,user_name,pwd,role) values(#{id},#{userName},#{pwd},#{role})"})
    @Insert({"delete from customer where id=#{id}"})
    void insert(Customer u);

//    @Update("update sys_user set user_name = #{userName} where id=#{id} ")
//    void update(User u);
//
//    @Delete("delete from sys_user where id=#{id} ")
//    void delete(@Param("id")String id);
//
//    @Select("select id,user_name from sys_user where id=#{id} ")
//    User find(@Param("id")String id);
//
//    //注：方法名和要UserMapper.xml中的id一致
//    List<User> query(@Param("userName")String userName);
//
//    @Delete("delete from sys_user")
//    void deleteAll();
}
