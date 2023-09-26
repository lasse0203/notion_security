package com.example.project_secu.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/public")
public class PublicController {
    @GetMapping
    public String getHomePublic(){
        return"homepublic";
    }
    @GetMapping ("/pagepublic")
    public String pagepublique(){
        return "pagepublic";
    }
}
