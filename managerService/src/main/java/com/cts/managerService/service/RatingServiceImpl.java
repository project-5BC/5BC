package com.cts.managerService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.managerService.entityClass.RatingData;
import com.cts.managerService.modelClass.RatingDataModel;
import com.cts.managerService.modelClass.ReviewDataModel;
import com.cts.managerService.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public void saveRating(RatingDataModel dataModel) {
		// TODO Auto-generated method stub
		RatingData data = new RatingData();
		data.setDelivarableId(dataModel.getDelivarableId());
		data.setEmployeeId(dataModel.getEmployeeId());
		data.setRating(dataModel.getRating());
		
		this.ratingRepository.save(data);
	}

	@Override
	public void updateRating(ReviewDataModel dataModel) {
		// TODO Auto-generated method stub
		
		RatingData data = new RatingData();
		data.setDelivarableId(dataModel.getDelivarableId());
		data.setEmployeeId(dataModel.getEmployeeId());
		data.setRating(dataModel.getRating());
		data.setReview(dataModel.getReview());
		
		this.ratingRepository.save(data);

	}

}
