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
	
	@JsonIgnore
	private Map<Integer, Review> reviewMap = new HashMap<Integer, Review>();
	
	public AverageReview getAverageReview() {
		return AverageReview.getAverageReview(getReviews());
	}

	public List<Review> getReviews() {
		return new ArrayList<Review>(reviewMap.values());
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
