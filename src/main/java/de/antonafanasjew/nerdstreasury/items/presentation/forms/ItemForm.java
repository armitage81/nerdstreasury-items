package de.antonafanasjew.nerdstreasury.items.presentation.forms;

import de.antonafanasjew.nerdstreasury.items.model.Item;
import lombok.Data;

@Data
public class ItemForm {
	private String title;
	private String sortTerm;
	private String developer;
	private String publisher;
	private String genre;
	
	public Item toItem() {
		return new Item(title, sortTerm, developer, publisher, genre);
	}
}
