package com.example.microservicesbasics.pictures.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PicturesLogicManager {
	@Value("${pictureApiUrl:https://jsonplaceholder.typicode.com/users}")
	private String pictureApiUrl;
	@Value("${pictureApiKey:}")
	private String pictureApiKey;
	@Value("${pictureApiTags:}")
	private String pictureApiTags;
	
	public String obtainPictureApiImageUrl() {
		String apiUrl = pictureApiUrl + pictureApiKey + pictureApiTags;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		return response.getBody();
	}
}
