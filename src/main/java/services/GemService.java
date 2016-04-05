package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import databases.Database;
import models.Gem;

public class GemService {
	
	private Map<Integer, Gem> gems = Database.getGems();
	
	/*
	 {
		  "name": "Ruby",
		  "specifications": "24 Carat pure diamond",
		  "description": "Shines bright like a diamond",
		  "quantity": 10,
		  "canPurchase": true,
		  "soldOut": false,
		  "id": 1
	  }
	 */
	
	public GemService() {
//		Gem gem = new Gem();
//		gem.setId(1);
//		gem.setName("Ruby");
//		gem.setSpecifications("24 Carat pure diamond");
//		gem.setDescription("Shines bright like a diamond");
//		gem.setQuantity(10);
//		gem.setCanPurchase(true);
//		gem.setSoldOut(false);
//		Map<Integer, Image> images = new HashMap<Integer, Image>();
//		Image image = new Image("thumb.jpg", "image.jpg");
//		image.setId(1);
//		images.put(image.getId(), image);
//		Map<Integer, Review> reviews = new HashMap<Integer, Review>();
//		Review review = new Review(5, "Body of the review", "Author");
//		review.setId(1);
//		reviews.put(review.getId(), review);
//		gem.setReviews(reviews);
//		gem.setImages(images);
//		gems.put(gem.getId(), gem);
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
	
	/**Update Gem
	 * Sets Id and preserves reviews
	 * @param id
	 * @param gem
	 * @return
	 */
	public Gem updateGem(Integer id, Gem gem) {
		if (id == null || gem == null)
			return null;
		Gem existingGem = this.gems.get(id);
		if (existingGem == null)
			return null;
		gem.setId(id);
		gem.setGemReview(existingGem.getGemReview());
		if (gem.getQuantity() < 1)
			gem.setSoldOut(true);
		this.gems.put(id, gem);
		return gem;
	}
	
	public Gem deleteGem(Integer id) {
		if (id == null)
			return null;
		return this.gems.remove(id);
	}
	
	public boolean isGemPresent(Integer gemId) {
		if (gemId == null)
			return false;
		return gems.containsKey(gemId);
	}

}
