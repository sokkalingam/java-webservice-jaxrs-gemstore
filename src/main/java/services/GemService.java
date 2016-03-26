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
		gem.setReviews(Arrays.asList(new Review(5, "This is the review body", "Sokka")));
		gem.setImages(Arrays.asList(new Image("thumb", "img")));
	}
	
	public List<Gem> getAllGems() {
		return new ArrayList<Gem>(this.gems.values());
	}
	
	public Gem getGem(Integer id) {
		if (id == null)
			return null;
		return this.gems.get(id);
	}
	
	public Gem addGem(Gem gem) {
		if (gem == null)
			return null;
		gem.setId(this.gems.size() + 1);
		this.gems.put(gem.getId(), gem);
		return gem;
	}
	
	public Gem updateGem(Integer id, Gem gem) {
		if (id == null || gem == null)
			return null;
		if (this.gems.get(id) == null)
			return null;
		gem.setId(id);
		this.gems.put(id, gem);
		return gem;
	}
	
	public Gem deleteGem(Integer id) {
		if (id == null)
			return null;
		return this.gems.remove(id);
	}

}
