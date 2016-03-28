package models;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "name", "price", "description", "quantity", "canPurchase", "soldOut", "specifications" })
public class Gem extends Model {

	/*
	 {
		  "name": "Ruby",
		  "specifications": "24 Carat pure diamond",
		  "description": "Shines bright like a diamond",
		  "quantity": 10,
		  "canPurchase": true,
		  "soldOut": false,
		  "images": [
		    {
		      "thumb": "thumb",
		      "img": "img",
		      "id": 1
		    }
		  ],
		  "reviews": [
		    {
		      "stars": 5,
		      "body": "This is the review body",
		      "author": "Sokka",
		      "id": 1
		    }
		  ],
		  "id": 1
	  }
	 */

	@Override
	public String toString() {
		return "Gem [id="+ super.getId() +", name=" + name + ", price=" + price + ", description=" + description + ", quantity=" + quantity
				+ ", canPurchase=" + canPurchase + ", soldOut=" + soldOut + ", specifications=" + specifications
				+ ", images=" + images + ", reviews=" + reviews + "]";
	}

	@JsonProperty("name")
	private String name;
	@JsonProperty("price")
	private Double price;
	@JsonProperty("description")
	private String description;
	@JsonProperty("quantity")
	private Integer quantity;
	@JsonProperty("canPurchase")
	private Boolean canPurchase;
	@JsonProperty("soldOut")
	private Boolean soldOut;
	@JsonProperty("specifications")
	private String specifications;
	@JsonProperty("image")
	private String image;
	@JsonIgnore
	private Map<Integer, Image> images = new HashMap<Integer, Image>();
	@JsonIgnore
	private Map<Integer, Review> reviews = new HashMap<Integer, Review>();

	/**
	 * 
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The price
	 */
	@JsonProperty("price")
	public Double getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 *            The price
	 */
	@JsonProperty("price")
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * 
	 * @return The description
	 */
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *            The description
	 */
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return The quantity
	 */
	@JsonProperty("quantity")
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * 
	 * @param quantity
	 *            The quantity
	 */
	@JsonProperty("quantity")
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * 
	 * @return The canPurchase
	 */
	@JsonProperty("canPurchase")
	public Boolean getCanPurchase() {
		return canPurchase;
	}

	/**
	 * 
	 * @param canPurchase
	 *            The canPurchase
	 */
	@JsonProperty("canPurchase")
	public void setCanPurchase(Boolean canPurchase) {
		this.canPurchase = canPurchase;
	}

	/**
	 * 
	 * @return The soldOut
	 */
	@JsonProperty("soldOut")
	public Boolean getSoldOut() {
		return soldOut;
	}

	/**
	 * 
	 * @param soldOut
	 *            The soldOut
	 */
	@JsonProperty("soldOut")
	public void setSoldOut(Boolean soldOut) {
		this.soldOut = soldOut;
	}

	/**
	 * 
	 * @return The specifications
	 */
	@JsonProperty("specifications")
	public String getSpecifications() {
		return specifications;
	}

	/**
	 * 
	 * @param specifications
	 *            The specifications
	 */
	@JsonProperty("specifications")
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	
	/**
	 * 
	 * @return image
	 */
	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	/**
	 * 
	 * @param image
	 *            The specifications
	 */
	@JsonProperty("image")
	public void setImage(String image) {
		this.image = image;
	}

	/**
	* 
	* @return
	* The images
	*/
	public Map<Integer, Image> getImages() {
	return images;
	}

	/**
	* 
	* @param images
	* The images
	*/
	public void setImages(Map<Integer, Image> images) {
	this.images = images;
	}

	/**
	* 
	* @return
	* The reviews
	*/
	public Map<Integer, Review> getReviews() {
	return reviews;
	}

	/**
	* 
	* @param reviews
	* The reviews
	*/
	public void setReviews(Map<Integer, Review> reviews) {
	this.reviews = reviews;
	}
	
	public static Gem generateModel(int i) {
		Gem gem = new Gem();
		gem.setId(1);
		gem.setName("Ruby " + i);
		gem.setSpecifications("Specs of Ruby");
		gem.setDescription("Description of ruby");
		gem.setQuantity(10);
		gem.setCanPurchase(true);
		gem.setSoldOut(false);
		gem.setImage("http://kodarat.com/wp-content/uploads/2015/01/sapphire.jpg");
		return gem;
	}
}