package models.review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GemReview {
	
	public GemReview() {
	}
	
	public GemReview(AverageReview averageReview, List<Review> reviews) {
		super();
		this.averageReview = averageReview;
		this.setReviews(reviews);
	}
	
	private AverageReview averageReview;
	private List<Review> reviews = new ArrayList<Review>();
	@JsonIgnore
	private Map<Integer, Review> reviewMap = new HashMap<Integer, Review>();
	
	public AverageReview getAverageReview() {
		return averageReview;
	}
	public void setAverageReview(AverageReview averageReview) {
		this.averageReview = averageReview;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	@JsonIgnore
	public Map<Integer, Review> getReviewMap() {
		return reviewMap;
	}
	@JsonIgnore
	public void setReviewMap(Map<Integer, Review> reviews) {
		this.reviewMap = reviews;
	}

}
