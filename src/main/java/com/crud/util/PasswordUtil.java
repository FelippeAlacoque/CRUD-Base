package com.crud.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {
	
	public String gerarSenhaBCrypt (String senha) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if (senha == null)
			return senha;
		
		return encoder.encode(senha);
	}
	
	public static boolean validarSenha (String senha, String senhaEncoded) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.matches(senha, senhaEncoded);
	}

}
