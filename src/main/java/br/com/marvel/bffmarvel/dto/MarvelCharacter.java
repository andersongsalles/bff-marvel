package br.com.marvel.bffmarvel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

public class MarvelCharacter {
	
	@JsonProperty("id")
	@Getter @Setter
	private BigDecimal id;
	
	@JsonProperty("name")
	@Getter @Setter
	private String name;
	
	@JsonProperty("description")
	@Getter @Setter
	private String description;
	
	@JsonProperty("comics")
	@Getter @Setter	
	private List<MarvelComics> comics;
	
	@JsonProperty("events")
	@Getter @Setter	
	private List<MarvelEvents> events;	

}
