package com.bhoomi.Trading.controller;

import com.bhoomi.Trading.model.UserT;
import com.bhoomi.Trading.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserRepo userRepo;
    @PostMapping("/signup")
    public ResponseEntity<UserT> register(@RequestBody UserT user){
UserT newuser=new UserT();

newuser.setEmail(user.getEmail());
newuser.setPassword(user.getPassword());
newuser.setEmail(user.getEmail());
newuser.setFullname(user.getFullname());



UserT saveduser=userRepo.save(newuser);
return  new ResponseEntity<>(saveduser, HttpStatus.CREATED);
    }
}
