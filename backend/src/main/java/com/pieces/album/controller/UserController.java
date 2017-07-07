package com.pieces.album.controller;

import com.pieces.album.model.User;
import com.pieces.album.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.ServletException;
import java.util.Date;
import java.util.Map;

/**
 * Created by nghongquang on 05.07.17.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestBody Map<String, String> json) throws ServletException {
        if(json.get("username") == null || json.get("password") == null) {
            throw new ServletException("Please fill in username and password");
        }
        String username = json.get("username");
        String password = json.get("password");

        User user = userService.findByUserName(username);

        if(user == null) {
            throw new ServletException("User name not found.");
        }

        String pwd = user.getPassword();

        if(!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your username and password");
        }

        return Jwts.builder().setSubject(username).claim("roles","user").setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "secretkey").compact();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User registerUser(@RequestBody User user) {
        return userService.save(user);
    }

}
