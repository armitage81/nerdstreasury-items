package de.antonafanasjew.nerdstreasury.items.presentation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.antonafanasjew.nerdstreasury.items.model.Item;
import de.antonafanasjew.nerdstreasury.items.persistence.ItemRepository;
import de.antonafanasjew.nerdstreasury.items.presentation.forms.ItemForm;

@Controller
@RequestMapping("item")
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping
	public String itemForm() {
		return "item";
	}
	
	@PostMapping
	public String processRegistration(@Valid ItemForm itemForm, BindingResult bindingResult) {
		Item item = itemForm.toItem();
		itemRepository.save(item);
		return "redirect:/item-list";
	}
	
}
