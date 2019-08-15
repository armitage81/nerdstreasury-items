package de.antonafanasjew.nerdstreasury.items.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	/**
	 * Activating DB based user management
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select USERNAME, PASSWORD, ENABLED from USER where USERNAME = ?")
			.authoritiesByUsernameQuery("select USERNAME, AUTHORITY from USER_AUTHORITY where USERNAME = ?")
			.passwordEncoder(new BCryptPasswordEncoder());
			;
	}
		
}
