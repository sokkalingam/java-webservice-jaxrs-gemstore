package services;

import java.util.ArrayList;
import java.util.Arrays;
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
		gem.setReviews(Arrays.asList(new Review(1, 5, "Awesome body", "Sokka")));
		gem.setImages(Arrays.asList(new Image(1, "thumb.com/thumb.jpg", "img.com/img/jpg")));
	}
	
	public List<Gem> getAllGems() {
		return new ArrayList<Gem>(this.gems.values());
	}

}
