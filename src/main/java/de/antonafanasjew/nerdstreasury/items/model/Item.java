package de.antonafanasjew.nerdstreasury.items.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="ITEM")
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Size(min=1, message="Title must not be empty")
	@Column(name="TITLE")
	private String title;
	
	@Column(name="SORT_TERM")
	private String sortTerm;

	@Column(name="DEVELOPER")
	private String developer;
	
	@Column(name="PUBLISHER")
	private String publisher;

	@NotNull
	@Size(min=1, message="Genre must not be empty")
	@Column(name="GENRE")
	private String genre;
	
	@NotNull
	@Size(min=1, message="System must not be empty")
	@Column(name="SYSTEM")
	private String system;
	
	
	
}
