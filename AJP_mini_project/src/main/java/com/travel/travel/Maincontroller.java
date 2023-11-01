package com.travel.travel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


 @Controller
public class Maincontroller {
    @GetMapping("/register")
    public String registerform(@ModelAttribute("frm") forms frm) 
    {
        return "register";
    }

    @RequestMapping("/registersuccess")
    public String registersucc(@ModelAttribute ("frm") forms frm) 
    {
        return "success";
    }
}

