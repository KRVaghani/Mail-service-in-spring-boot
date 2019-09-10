package com.kaushik.spring5tutorial.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Configuration
public class MailConfig {

	
	@Bean
	public DemoBean demoBean() {
		return new DemoBean();
	}

	@Bean
	@ConditionalOnProperty(name="spring.mail.host",
			havingValue="foo", matchIfMissing=true)
	public MailSender mockMailSender() {
		return new MockMailSender();
	}
	
	@Bean
	@ConditionalOnProperty("spring.mail.host")
	public MailSender smtpMailSender(JavaMailSender javaMailSender) {
		
		demoBean();
		return new SmtpMailSender(javaMailSender);
		
	}
}
