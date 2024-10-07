package com.landingpage.landingpage.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender){
        this.mailSender = mailSender;
    }

    @Async
    public void sendEmail(String from, String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("heron11carlos@gmail.com");
        message.setSubject("MoRHinga - Novo Email");
        message.setText(body+"\n\n"+from);
        message.setFrom("heron11carlos@gmail.com");

        mailSender.send(message);
    }
}
