package de.antonafanasjew.nerdstreasury.items.persistence;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import de.antonafanasjew.nerdstreasury.items.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

	Item findByTitle(String title);
	Iterable<Item> findAll(Pageable pageable);
	
	
}
