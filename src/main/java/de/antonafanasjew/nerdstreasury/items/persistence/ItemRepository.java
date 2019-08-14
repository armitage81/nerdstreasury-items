package de.antonafanasjew.nerdstreasury.items.persistence;

import org.springframework.data.repository.CrudRepository;

import de.antonafanasjew.nerdstreasury.items.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

	Item findByTitle(String title);
	
}
