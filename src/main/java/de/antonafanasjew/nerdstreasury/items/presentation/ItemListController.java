package de.antonafanasjew.nerdstreasury.items.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.common.collect.Lists;

import de.antonafanasjew.nerdstreasury.items.model.Item;
import de.antonafanasjew.nerdstreasury.items.persistence.ItemRepository;

@Controller
public class ItemListController {

	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/item-list")
	public String home(Model model) {
		Iterable<Item> items = itemRepository.findAll();
		model.addAttribute("items", Lists.newArrayList(items));
		return "item-list";
	}
	
}