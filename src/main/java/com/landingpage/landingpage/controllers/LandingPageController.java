package com.landingpage.landingpage.controllers;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.landingpage.landingpage.models.Email;
import com.landingpage.landingpage.services.EmailService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping
@Controller
public class LandingPageController {

    @Autowired
    EmailService emailService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("email", new Email());
        return mav;
    }

    @PostMapping("/contatar")
    public String postContatar(Email email) {
        try{
            emailService.sendEmail(email.getFrom(), email.getMensagem());
        } catch (Exception e){
            System.err.println(e.toString());
        }
        return "redirect:/";
    }



}
