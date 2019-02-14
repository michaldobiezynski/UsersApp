package com.michal.users.controller;

import com.michal.users.model.user;
import com.michal.users.service.userService;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class userController
{
    @Autowired
    private userService userservice;



    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<user> list()
    {
        return userservice.findAll();
    }

    @RequestMapping(value = "users", method = RequestMethod.POST)
    public user create (@RequestBody user User)
    {
        return userservice.saveAndFlush(User);
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    public user get(@PathVariable Long id)
    {
        return userservice.findById(id).orElse(null);
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public user update(@PathVariable Long id, @RequestBody user User)
    {
        user existingUser = userservice.findById(id).orElse(null);
        BeanUtils.copyProperties(User, existingUser);
        return userservice.saveAndFlush(existingUser);
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public user delete(@PathVariable Long id)
    {
        user existingUser = userservice.findById(id).orElse(null);
        userservice.delete(existingUser);
        return existingUser;
    }







}
