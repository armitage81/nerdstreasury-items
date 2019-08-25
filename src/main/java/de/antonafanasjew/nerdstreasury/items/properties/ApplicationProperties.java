package de.antonafanasjew.nerdstreasury.items.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "custom.application")
public class ApplicationProperties {

	private String name;
	private String author;
	private String title;
	
	private PagingProperties paging;
	
}
