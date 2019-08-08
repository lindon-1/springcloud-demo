package com.example.proviceruser.controller;

import com.example.proviceruser.dao.UserRespository;
import com.example.proviceruser.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @param :
 * @author : lindonglin
 * @Description :
 * @ate : 10:20  2019/8/6
 * @return :
 */

@RestController
public class UserController {

    @Resource
    private UserRespository userRespository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = userRespository.findOne(id);
        return user;
    }
}
