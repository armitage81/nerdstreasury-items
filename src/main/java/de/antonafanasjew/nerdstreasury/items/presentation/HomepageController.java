package de.antonafanasjew.nerdstreasury.items.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
}
