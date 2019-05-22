package com.feijo.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.feijo.springboot.domain.Cliente;
import com.feijo.springboot.repositories.ClienteRepository;
import com.feijo.springboot.services.exceptions.ObjectNotFoundException;

@Service
public class AuthService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	BCryptPasswordEncoder pe;
	
	@Autowired
	EmailService emailService;
	
	public void sendNewPassword(String email) {
		
		Cliente cliente = clienteRepository.findByEmail(email);
		
		if (cliente==null) {
			throw new ObjectNotFoundException("Email não encontrado");
		}
		
		String newPass = newPassword();
		cliente.setSenha(pe.encode(newPass));
		
		clienteRepository.save(cliente);
		emailService.sendNewPasswordEmail(cliente, newPass);
	}

	private String newPassword() {
		return "123";
	}
	
}
