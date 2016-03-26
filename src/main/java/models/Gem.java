package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"name", "price", "description", "quantity", "canPurchase", "soldOut", "specifications",
		"images", "reviews" })
public class Gem extends Model{

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
	@JsonProperty("images")
	private Map<Integer, Image> images = new HashMap<Integer, Image>();
	@JsonProperty("reviews")
	private Map<Integer, Review> reviews = new HashMap<Integer, Review>();
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	 * @return The images
	 */
	@JsonProperty("images")
	public List<Image> getImages() {
		return new ArrayList<Image>(this.images.values());
	}

	/**
	 * 
	 * @param images
	 *            The images
	 */
	@JsonProperty("images")
	public void setImages(List<Image> images) {
		this.images = Model.getMapFromList(images);
	}

	/**
	 * 
	 * @return The reviews
	 */
	@JsonProperty("reviews")
	public List<Review> getReviews() {
		return new ArrayList<Review>(this.reviews.values());
	}

	/**
	 * 
	 * @param reviews
	 *            The reviews
	 */
	@JsonProperty("reviews")
	public void setReviews(List<Review> reviews) {
		this.reviews = Model.getMapFromList(reviews);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	/*
	 * Custom getters and setters
	 */
	@JsonIgnore
	public Map<Integer, Image> getImagesMap() {
		return this.images;
	}
	
	@JsonIgnore
	public Map<Integer, Review> getReviewsMap() {
		return this.reviews;
	}

}