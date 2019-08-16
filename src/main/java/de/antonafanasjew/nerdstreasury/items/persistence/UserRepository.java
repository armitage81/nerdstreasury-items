package de.antonafanasjew.nerdstreasury.items.persistence;

import org.springframework.data.repository.CrudRepository;

import de.antonafanasjew.nerdstreasury.items.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
