package com.assignment.email_demo.controller;

import com.assignment.email_demo.dtos.EmailDto;
import com.assignment.email_demo.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/email")
public class Test {
    private final EmailService emailService;

    public Test(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping()
    public String sendEmail(@RequestBody EmailDto email) {
        emailService.sendMail(email.getEmail(), email.getSubject(), email.getBody());
        return "email sent!";
    }
}
