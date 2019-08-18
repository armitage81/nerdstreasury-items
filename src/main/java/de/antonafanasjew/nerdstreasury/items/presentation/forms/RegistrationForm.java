package de.antonafanasjew.nerdstreasury.items.presentation.forms;

import de.antonafanasjew.nerdstreasury.items.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data
public class RegistrationForm {
	private String username;
	private String password;
	private String firstName;
	private String secondName;
	
	public User toUser(PasswordEncoder passwordEncoder) {
		return new User(username, passwordEncoder.encode(password), firstName, secondName);
	}
}
