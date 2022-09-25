package br.com.marvel.bffmarvel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class MarvelComics {
	
	@JsonProperty("title")
	@Getter @Setter
	private String title;	
	
	@JsonProperty("issueNumber")
	@Getter @Setter
	private BigDecimal issueNumber;	

}
