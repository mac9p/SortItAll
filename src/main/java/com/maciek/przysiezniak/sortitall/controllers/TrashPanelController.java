package com.maciek.przysiezniak.sortitall.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trashpanel")
public class TrashPanelController {

    @RequestMapping
    public String getTrashPanel(){
        return "trashpanel";
    }

}
