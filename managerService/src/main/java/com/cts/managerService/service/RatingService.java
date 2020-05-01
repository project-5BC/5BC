package com.cts.managerService.service;

import org.springframework.stereotype.Service;

import com.cts.managerService.modelClass.RatingDataModel;
import com.cts.managerService.modelClass.ReviewDataModel;

@Service
public interface RatingService {
	public void saveRating(RatingDataModel dataModel);
	public void updateRating(ReviewDataModel dataModel);
}
