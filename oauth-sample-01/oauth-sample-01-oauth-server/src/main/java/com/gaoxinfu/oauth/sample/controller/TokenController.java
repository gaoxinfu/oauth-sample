package com.gaoxinfu.oauth.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {
    /**
     * 仅仅用于测试返回的code
     * @param code
     * @return
     */
    @GetMapping("/token/api/callback")
    public String callback(@RequestParam String code){
        return "oauth code = " +code;
    }

}
