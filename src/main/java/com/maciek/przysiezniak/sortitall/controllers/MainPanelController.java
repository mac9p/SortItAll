package com.maciek.przysiezniak.sortitall.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mainpanel")
public class MainPanelController {


    @RequestMapping
    public String getMainPanel(){
        return "mainpanel";
    }

}
