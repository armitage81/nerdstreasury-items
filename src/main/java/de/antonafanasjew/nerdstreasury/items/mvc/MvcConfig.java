package de.antonafanasjew.nerdstreasury.items.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/homepage").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/login");
	}

}
