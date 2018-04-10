package com.example.microservicesbasics.images.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImagesWeb {
	@Value("${imagesApiUrl:default.images.url}")
	private String imagesApiUrl;
	@Value("${imagesApiKey:123456}")
	private String imagesApiKey;
	
	@RequestMapping("/images")
	@ResponseBody
	ImagesWebResult images() {
		ImagesWebResult iwRes = new ImagesWebResult();
		iwRes.setApiurl(imagesApiUrl);
		return iwRes;
	}
}
