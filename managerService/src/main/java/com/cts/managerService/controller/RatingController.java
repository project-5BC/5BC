package com.cts.managerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.managerService.modelClass.RatingDataModel;
import com.cts.managerService.modelClass.ReviewDataModel;
import com.cts.managerService.service.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/saveRating")
	public void saveRating(@RequestBody RatingDataModel dataModel) {
		
		this.ratingService.saveRating(dataModel);
	}
	
	@PutMapping("/updateReview")
	public void updateReview(@RequestBody ReviewDataModel dataModel) {
		
		this.ratingService.updateRating(dataModel);
	}
	
}
