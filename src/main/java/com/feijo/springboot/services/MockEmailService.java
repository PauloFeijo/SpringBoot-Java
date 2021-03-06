package com.feijo.springboot.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService {
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(MockEmailService.class);

	@Override
	public void sendEmail(SimpleMailMessage msg) {
		log.info("Simulando envio de e-mail...");
		log.info(msg.toString());
		log.info("Email enviado");
		
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		log.info("Simulando envio de e-mail HTML...");
		log.info(msg.toString());
		log.info("Email enviado");
		
	} 

}
