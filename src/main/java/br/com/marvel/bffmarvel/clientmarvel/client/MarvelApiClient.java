package br.com.marvel.bffmarvel.clientmarvel.client;

import br.com.marvel.bffmarvel.clientmarvel.configuration.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(contextId = "MarvelApiClient", name = "${marvelPublicAPIV1.name:marvelPublicAPIV1}", url = "${marvelPublicAPIV1.url:http://gateway.marvel.com/v1/public}", configuration = ClientConfiguration.class)
public interface MarvelApiClient extends MarvelApi {
	
}
