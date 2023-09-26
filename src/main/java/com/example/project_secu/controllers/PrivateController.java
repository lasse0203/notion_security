package com.example.project_secu.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String getSecretPage(){
        return"private/home";
    }
    @GetMapping("/page1")
    public String getSecretPage1(){
        return"private/page1";
    }
    @GetMapping("/page2")
    public String getSecretPage2(){
        return"private/page2";
    }
}
