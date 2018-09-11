package com.example.demo.service.inf;

import com.example.demo.model.TbUser;

import java.util.List;

public interface IUserService {
    void add(TbUser tbUser);
    void update(TbUser tbUser);
    void delete(int id);
    TbUser findOne(int id);
    List<TbUser> findAll();
}
