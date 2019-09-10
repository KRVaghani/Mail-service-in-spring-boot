package com.kaushik.spring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class SmtpMailSender implements MailSender {

	private static Log Log = LogFactory.getLog(SmtpMailSender.class);
	@Override
	public void send(String to, String subject, String body) {
		// TODO Auto-generated method stub
		Log.info("Sending SMTP mail to " + to);
		Log.info("with subject " + subject);
		Log.info("and body " + body);

	}

}
