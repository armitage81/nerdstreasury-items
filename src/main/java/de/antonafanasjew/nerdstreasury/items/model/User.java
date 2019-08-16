package de.antonafanasjew.nerdstreasury.items.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.google.common.collect.Lists;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
@Table(name="USER")
public class User implements UserDetails {
	
	private static final long serialVersionUID = 2178334366142754889L;

	@Id
	@SequenceGenerator(name= "USER_SEQUENCE", sequenceName = "USER_SEQUENCE_ID", initialValue=1000, allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="USER_SEQUENCE")
	private Long id;
	
	@Column(name = "USERNAME")
	private final String username;
	
	@Column(name = "PASSWORD")
	private final String password;
	
	@Column(name = "FIRST_NAME")
	private final String firstName;
	
	@Column(name = "SECOND_NAME")
	private final String secondName;

	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Lists.newArrayList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
}
