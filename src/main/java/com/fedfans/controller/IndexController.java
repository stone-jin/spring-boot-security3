package com.fedfans.controller;

import com.fedfans.VO.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by stone-jin on 2018/4/27.
 */
@Controller
@Slf4j
@RequestMapping("")
public class IndexController {

    @RequestMapping("/login")
    public String hello(UserVO userVO,Model model ){
        model.addAttribute("user", userVO);
        log.info("hello");
        return "index2";
    }

    @RequestMapping("/hello")
    public String hello1(){
        return "index3";
    }

    @GetMapping("/error")
    public String errorPage(){
        log.info("error");
        return "index2";
    }
}