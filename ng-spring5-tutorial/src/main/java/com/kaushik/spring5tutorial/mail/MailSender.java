package com.kaushik.spring5tutorial.mail;

public interface MailSender {
	void send(String to,String subject,String body);
}
