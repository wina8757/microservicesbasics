package com.example.microservicesbasics.pictures.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PicturesWeb {
	@RequestMapping("/pictures")
	@ResponseBody
	PicturesWebResult pictures() {
		PicturesWebResult pwRes = new PicturesWebResult();
		pwRes.setId("2");
		pwRes.setName("pictures");
		pwRes.setUrl("stub.url");
		return pwRes;
	} 
}
