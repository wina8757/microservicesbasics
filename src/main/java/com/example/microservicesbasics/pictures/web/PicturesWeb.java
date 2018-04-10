package com.example.microservicesbasics.pictures.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicesbasics.pictures.logic.PicturesLogicManager;

@RestController
public class PicturesWeb {
	@Autowired
	PicturesLogicManager manager;
	@RequestMapping("/pictures")
	@ResponseBody
	ResponseEntity<String> pictures() {
		ResponseEntity<String> result = manager.obtainPictureApiImageUrl();
//		PicturesWebResult pwRes = new PicturesWebResult();
//		pwRes.setUrl(result);
		
		return result;
	} 
}
