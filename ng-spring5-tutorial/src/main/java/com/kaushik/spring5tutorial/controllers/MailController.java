package com.kaushik.spring5tutorial.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaushik.spring5tutorial.mail.MailSender;
import com.kaushik.spring5tutorial.mail.MockMailSender;
import com.kaushik.spring5tutorial.mail.SmtpMailSender;

@RestController
public class MailController {

	
	private MailSender mailSender;
	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}
	
	@RequestMapping("/mail")   
	public String mail() throws MessagingException {
		
		mailSender.send("kaushik.vaghani111@gmail.com","A test mail", "Body of the test mail");
		return "Mail send";
	}
}
