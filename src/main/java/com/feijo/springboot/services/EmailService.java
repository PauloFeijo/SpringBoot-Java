package com.feijo.springboot.services;

import org.springframework.mail.SimpleMailMessage;

import com.feijo.springboot.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
