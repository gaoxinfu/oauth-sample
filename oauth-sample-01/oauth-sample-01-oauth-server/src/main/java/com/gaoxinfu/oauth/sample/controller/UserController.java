package com.gaoxinfu.oauth.sample.controller;

import com.gaoxinfu.oauth.sample.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    /**
     *
     * @return
     */
    @GetMapping("/api/getUser")
    public ResponseEntity<UserEntity> getUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(new UserEntity(user.getUsername(),user.getUsername() + "@aliyun.com"));
    }
}