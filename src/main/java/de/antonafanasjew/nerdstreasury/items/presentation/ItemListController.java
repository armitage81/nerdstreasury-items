package de.antonafanasjew.nerdstreasury.items.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.common.collect.Lists;

import de.antonafanasjew.nerdstreasury.items.model.Item;
import de.antonafanasjew.nerdstreasury.items.model.User;
import de.antonafanasjew.nerdstreasury.items.persistence.ItemRepository;
import de.antonafanasjew.nerdstreasury.items.properties.ApplicationProperties;

@Controller
public class ItemListController {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired ApplicationProperties applicationProperties;
	
	@GetMapping("/item-list")
	public String home(
			Model model, 
			@AuthenticationPrincipal User user, 
			@RequestParam(name="page", required = false, defaultValue = "0") int page,
			@RequestParam(name="orderBy", required=false, defaultValue = "sortTerm") String sortTerm) {
		
		Pageable pageable = PageRequest.of(page, applicationProperties.getPaging().getPageSize(), Sort.by(sortTerm));
		
		
		Iterable<Item> items = itemRepository.findAll(pageable);
		model.addAttribute("title", applicationProperties.getTitle());
		model.addAttribute("items", Lists.newArrayList(items));
		model.addAttribute("name", user.getFirstName());
		return "item-list";
	}
	
}
