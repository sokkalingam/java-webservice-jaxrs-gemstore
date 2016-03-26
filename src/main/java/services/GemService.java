package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import databases.Database;
import models.Gem;
import models.Image;
import models.Review;

public class GemService {
	
	private Map<Integer, Gem> gems = Database.getGems();
	
	public GemService() {
		Gem gem = new Gem();
		gem.setId(1);
		gem.setName("Ruby");
		gems.put(gem.getId(), gem);
		Map<Integer, Image> images = new HashMap<Integer, Image>();
		Map<Integer, Review> reviews = new HashMap<Integer, Review>();
		images.put(1, new Image(1, "thumb", "img"));
		reviews.put(1, new Review(1, 5, "This is the review body", "Sokka"));
		gem.setReviews(reviews);
		gem.setImages(images);
	}
	
	public List<Gem> getAllGems() {
		return new ArrayList<Gem>(this.gems.values());
	}

}
