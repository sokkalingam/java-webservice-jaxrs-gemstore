package services;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.review.AverageReview;
import models.review.GemReview;
import models.review.Review;

public class ReviewService {

	private GemService gemService = new GemService();

	public GemReview getGemReview(Integer gemId) {
		if (gemService.isGemPresent(gemId)) {
			List<Review> reviews = new ArrayList<Review>(gemService.getGem(gemId).getGemReview().getReviewMap().values());
			return new GemReview(getAverageReview(reviews), reviews);
		}
		return null;
	}

	public Review getReview(Integer gemId, Integer reviewId) {
		if (gemId == null || reviewId == null)
			return null;
		Map<Integer, Review> reviewMap = getReviewMap(gemId);
		if (reviewMap == null)
			return null;
		return reviewMap.get(reviewId);
	}

	public Review addReview(Integer gemId, Review review) {
		if (gemId == null || review == null)
			return null;
		Map<Integer, Review> reviewMap = getReviewMap(gemId);
		if (reviewMap == null)
			return null;
		review.setId(reviewMap.size() + 1);
		reviewMap.put(review.getId(), review);
		return review;
	}

	public Review updateReview(Integer gemId, Integer reviewId, Review review) {
		if (gemId == null || reviewId == null || review == null)
			return null;
		Map<Integer, Review> reviewMap = getReviewMap(gemId);
		if (reviewMap != null && reviewMap.containsKey(reviewId)) {
			review.setId(reviewId);
			reviewMap.put(reviewId, review);
			return review;
		}
		return null;
	}

	public Review deleteReview(Integer gemId, Integer reviewId) {
		if (gemId == null || reviewId == null)
			return null;
		Map<Integer, Review> reviewMap = getReviewMap(gemId);
		if (reviewMap == null)
			return null;
		return reviewMap.remove(reviewId);
	}

	public Map<Integer, Review> getReviewMap(Integer gemId) {
		if (gemService.isGemPresent(gemId))
			return gemService.getGem(gemId).getGemReview().getReviewMap();
		return null;
	}
	
	public AverageReview getAverageReview(List<Review> reviews) {
		
		if (reviews == null || reviews.size() == 0)
			return new AverageReview();
		
		AverageReview averageReview = new AverageReview();
		Map<Integer, Integer> starsToUsersMap = new HashMap<Integer, Integer>();
		
		Integer sumOfStars = 0;
		
		for (Review review : reviews) {
		
			Integer stars = review.getStars();
			sumOfStars += stars;
			
			if (starsToUsersMap.containsKey(stars))
				starsToUsersMap.put(stars, starsToUsersMap.get(stars) + 1);
			else
				starsToUsersMap.put(stars, 1);
			
		}
		
		Double avgReview = ((double)sumOfStars/(double)reviews.size());
		averageReview.setAverageReview(Double.valueOf(new DecimalFormat("#.##").format(avgReview)));
		averageReview.setStarsToUsersMap(starsToUsersMap);
		
		return averageReview;
	}

}
