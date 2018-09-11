package com.example.demo.service;

import com.example.demo.dao.TbUserMapper;
import com.example.demo.model.TbUser;
import com.example.demo.service.inf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private TbUserMapper tbUserMapper;


    @Override
    public void add(TbUser tbUser) {

    }

    @Override
    public void update(TbUser tbUser) {

    }

    @Override
    public void delete(int id) {
    }

    @Override
    @Cacheable(key = "#p0",value = "user")
    public TbUser findOne(int id) {
        TbUser tbUser =tbUserMapper.selectByPrimaryKey(id);
        return tbUser;
    }

    @Override
    public List<TbUser> findAll() {
        return null;
    }
}
