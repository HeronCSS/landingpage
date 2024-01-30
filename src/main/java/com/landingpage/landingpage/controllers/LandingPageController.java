package com.landingpage.landingpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.landingpage.landingpage.models.Email;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RequestMapping
@Controller
public class LandingPageController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
    
    @GetMapping("/contatar")
    public ModelAndView contatar() {
        ModelAndView mav = new ModelAndView();
        return mav;
    }

    @PostMapping("/contatar")
    public void postContatar(@RequestBody Email email) {
     /*    enviarEmail(email); */
    }
    
    
}
