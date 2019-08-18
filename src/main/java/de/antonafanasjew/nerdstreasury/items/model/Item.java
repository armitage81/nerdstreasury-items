package de.antonafanasjew.nerdstreasury.items.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
@Table(name="ITEM")
public class Item {

	@Id
	@SequenceGenerator(name= "ITEM_SEQUENCE", sequenceName = "ITEM_SEQUENCE_ID", initialValue=1000, allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="ITEM_SEQUENCE")
	private long id;
	
	@NotNull
	@Size(min=1, message="Title must not be empty")
	@Column(name="TITLE")
	private final String title;
	
	@Column(name="SORT_TERM")
	private final String sortTerm;

	@Column(name="DEVELOPER")
	private final String developer;
	
	@Column(name="PUBLISHER")
	private final String publisher;

	@NotNull
	@Size(min=1, message="Genre must not be empty")
	@Column(name="GENRE")
	private final String genre;
	
}
