package com.example.customer.controller;

import com.example.customer.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @param :
 * @author : lindonglin
 * @Description :
 * @ate : 20:38  2019/8/8
 * @return :
 */
@RestController
public class MoviceController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:8080/" + id, User.class);
    }
}
