package br.com.marvel.bffmarvel.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BffConfiguration {
	
	@Value("${ts}")
	@Getter @Setter
	private String ts;
	
	@Value("${apiKey}")
	@Getter @Setter
	private String apiKey;	
	
	@Value("${hash}")
	@Getter @Setter
	private String hash;	

}
