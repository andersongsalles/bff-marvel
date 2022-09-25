package br.com.marvel.bffmarvel.service;


import br.com.marvel.bffmarvel.clientmarvel.client.MarvelApiClient;
import br.com.marvel.bffmarvel.clientmarvel.exception.NotFoundException;
import br.com.marvel.bffmarvel.clientmarvel.model.ComicDataWrapper;
import br.com.marvel.bffmarvel.clientmarvel.model.EventDataWrapper;
import br.com.marvel.bffmarvel.clientmarvel.model.InlineResponse200;
import br.com.marvel.bffmarvel.configuration.BffConfiguration;
import br.com.marvel.bffmarvel.dto.MarvelCharacter;
import br.com.marvel.bffmarvel.dto.MarvelComics;
import br.com.marvel.bffmarvel.dto.MarvelEvents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BffService {

	@Autowired
	private MarvelApiClient client;

	@Autowired
	private BffConfiguration configuration;

	public List<MarvelCharacter> findCharacters(String name) {
		List<MarvelCharacter> marvelCharacters = new ArrayList<>();
		ResponseEntity<InlineResponse200> listCharacters = client.listCharacters(configuration.getTs(),
				configuration.getApiKey(), configuration.getHash(), name, null, null, null, null, null, null, null,
				null, null);

		if (!listCharacters.getBody().getData().getResults().isEmpty()) {
			listCharacters.getBody().getData().getResults().forEach(c -> {
				MarvelCharacter marvelCharacter = new MarvelCharacter();

				marvelCharacter.setDescription(c.getDescription());
				marvelCharacter.setId(c.getId());
				marvelCharacter.setName(c.getName());
				
				marvelCharacter.setComics(findComicsByCharacter(String.valueOf(c.getId())));
				marvelCharacter.setEvents(findEventsByCharacter(String.valueOf(c.getId())));

				marvelCharacters.add(marvelCharacter);
			});
		} else {
			throw new NotFoundException("Personagens não encontrados. Deve ser da concorrente!!!");
		}

		return marvelCharacters;
	}

	public List<MarvelComics> findComicsByCharacter(String id) {
		ResponseEntity<ComicDataWrapper> characterComics = client.characterComics(configuration.getTs(),
				configuration.getApiKey(), configuration.getHash(), id, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, "-focDate", null, null);

		if (!characterComics.getBody().getData().getResults().isEmpty()) {
			return characterComics.getBody().getData().getResults().stream().map(m -> {
				MarvelComics marvelComics = new MarvelComics();
				marvelComics.setTitle(m.getTitle());
				marvelComics.setIssueNumber(m.getIssueNumber());
				return marvelComics;
			}).collect(Collectors.toList());
		}
		return null;
	}

	public List<MarvelEvents> findEventsByCharacter(String id) {
		ResponseEntity<EventDataWrapper> characterEvents = client.characterEvents(configuration.getTs(),
				configuration.getApiKey(), configuration.getHash(), id, null, null, null, null, null, null, null, null,
				null, null);

		if (!characterEvents.getBody().getData().getResults().isEmpty()) {
			return characterEvents.getBody().getData().getResults().stream().map(m -> {
				MarvelEvents marvelEvents = new MarvelEvents();
				marvelEvents.setDescription(m.getDescription());
				marvelEvents.setTitle(m.getTitle());
				return marvelEvents;
			}).collect(Collectors.toList());
		}
		return null;
	}

}
