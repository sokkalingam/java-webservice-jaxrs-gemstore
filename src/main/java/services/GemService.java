package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.lang3.StringUtils;

import databases.Database;
import models.Gem;
import services.helpers.ParseHelper;

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
	
	/**Search Gems based on query params
	 * Search by name contains and Price range within
	 * query params: name, minPrice, maxPrice
	 * @param uriInfo
	 * @return
	 */
	public List<Gem> searchGems(UriInfo uriInfo) {
		
		List<Gem> allGems = getAllGems();
		List<Gem> result = new ArrayList<Gem>();
		
		MultivaluedMap<String, String> queryParameters = uriInfo.getQueryParameters();
		String searchName = queryParameters.getFirst("name");
		String minPrice = queryParameters.getFirst("minPrice");
		String maxPrice = queryParameters.getFirst("maxPrice");
		String rating = queryParameters.getFirst("rating");
		for (Gem gem : allGems)
			if (_isNameContains(gem, searchName) && _isWithinPriceRange(gem, minPrice, maxPrice) && _isAverageReviewAbove(gem, rating))
				result.add(gem);
		
		return result;
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
	
	private boolean _isNameContains(Gem gem, String searchName) {
		if (StringUtils.isBlank(searchName))
			return true;
		return StringUtils.containsIgnoreCase(gem.getName(), searchName);
	}
	
	private boolean _isWithinPriceRange(Gem gem, String minPrice, String maxPrice) {
		if (StringUtils.isBlank(minPrice) && StringUtils.isBlank(maxPrice))
			return true;
		
		Double minPriceVal = ParseHelper.getDouble(minPrice);
		Double maxPriceVal = ParseHelper.getDouble(maxPrice);
		
		if (minPriceVal != null && maxPriceVal != null)
			return gem.getPrice() >= minPriceVal && gem.getPrice() <= maxPriceVal;

		if (minPriceVal != null)
			return gem.getPrice() >= minPriceVal;
			
		if (maxPriceVal != null)
			return gem.getPrice() <= maxPriceVal;
		
		return false;
	}
	
	private boolean _isAverageReviewAbove(Gem gem, String rating) {
		if (StringUtils.isBlank(rating))
			return true;
		
		Double val = ParseHelper.getDouble(rating);
		
		return val != null && gem.getGemReview().getAverageReview().getAverageReview() >= val;
		
	}

}
