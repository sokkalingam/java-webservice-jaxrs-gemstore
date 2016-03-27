package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import models.Review;

public class ReviewService {

	private GemService gemService = new GemService();

	public List<Review> getReviews(Integer gemId) {
		if (gemService.isGemPresent(gemId))
			return new ArrayList<Review>(gemService.getGem(gemId).getReviews().values());
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
			return gemService.getGem(gemId).getReviews();
		return null;
	}

}
