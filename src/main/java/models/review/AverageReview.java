package models.review;

import java.util.HashMap;
import java.util.Map;

public class AverageReview {

	private Double averageReview;
	private Map<Integer, Integer> starsToUsersMap = new HashMap<Integer, Integer>();
	
	@Override
	public String toString() {
		return "AverageReview [averageReview=" + averageReview + ", starsToUsersMap=" + starsToUsersMap + "]";
	}
	
	public Double getAverageReview() {
		return averageReview;
	}
	public void setAverageReview(Double averageReview) {
		this.averageReview = averageReview;
	}
	public Map<Integer, Integer> getStarsToUsersMap() {
		return starsToUsersMap;
	}
	public void setStarsToUsersMap(Map<Integer, Integer> starsToUsersMap) {
		this.starsToUsersMap = starsToUsersMap;
	}
	
}
