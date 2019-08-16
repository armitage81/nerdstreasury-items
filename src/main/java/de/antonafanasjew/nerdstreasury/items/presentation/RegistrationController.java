package de.antonafanasjew.nerdstreasury.items.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.antonafanasjew.nerdstreasury.items.model.User;
import de.antonafanasjew.nerdstreasury.items.persistence.UserRepository;
import de.antonafanasjew.nerdstreasury.items.security.RegistrationForm;

@Controller
@RequestMapping("register")
public class RegistrationController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping
	public String registerForm() {
		return "registration";
	}
	
	@PostMapping
	public String processRegistration(RegistrationForm registrationForm) {
		User user = registrationForm.toUser(passwordEncoder);
		userRepository.save(user);
		return "redirect:/login";
	}
	
}
