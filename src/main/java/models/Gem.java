package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
	 * { "name": "Ruby", "specifications": "24 Carat pure diamond",
	 * "description": "Shines bright like a diamond", "quantity": 10,
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
		return "Gem [id=" + super.getId() + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", quantity=" + quantity + ", canPurchase=" + canPurchase + ", soldOut=" + soldOut
				+ ", specifications=" + specifications + ", images=" + images + ", reviews=" + reviews + "]";
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
	 * @return The images
	 */
	public Map<Integer, Image> getImages() {
		return images;
	}

	/**
	 * 
	 * @param images
	 *            The images
	 */
	public void setImages(Map<Integer, Image> images) {
		this.images = images;
	}

	/**
	 * 
	 * @return The reviews
	 */
	public Map<Integer, Review> getReviews() {
		return reviews;
	}

	/**
	 * 
	 * @param reviews
	 *            The reviews
	 */
	public void setReviews(Map<Integer, Review> reviews) {
		this.reviews = reviews;
	}

	public static Gem generateModel(int i) {
		Gem gem = new Gem();
		gem.setId(1);
		gem.setName("Ruby " + i);
		gem.setSpecifications("Item ID:	399349, Content: 10 gems, Weight: 2.18ct (total), Calibrated: 3.5 mm, "
				+ "ExactSize:	3.50 mm x 2.06 mm (avg.), Shape:	Round Facet, Clarity:	VS-SI, "
				+ "Treatment:	Heated, Origin:	Myanmar");
		gem.setDescription("From the Radiant Reflections® collection, this spectacular solitaire ring for her features"
				+ " a 1/2-carat princess-cut diamond set in 10K white gold. The ring is meticulously crafted to create a"
				+ " larger, more dramatic look. Diamond Total Carat Weight may range from .45 - .57 carats.");
		gem.setQuantity(10);
		gem.setCanPurchase(true);
		gem.setSoldOut(false);
		gem.setImage(randomImage());
		gem.setPrice((double) (new Random().nextInt(30000) + 2000));
		return gem;
	}

	public static String randomImage() {
		String[] images = new String[] {
				"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcT8ypLVHhQwRsmYrtkvfGYvwb2C3gkhEsPpAIkxtKlb67lTl1y6Fg",
				"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcR5jBTWlnZ-CWbSesQb9iF-937pqdXyacoj9ysz-MfTOBuOtb_IPw",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqrxkyf8Vw-Rkl9UymC78lY96mGEX72Y8_PqiXB3Abi62pL1vb1g",
				"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSq8IG14CUvoKo3Rx3HiYNyZhVnGZ8C7J7vSC3Gh2iQ3aI0BOFI",
				"http://www.shopnaser.com/images/diamonds_facts.png",
				"http://greenwich.blob.core.windows.net/pages/our-story/images/diamonds.png",
				"http://pngimg.com/upload/diamond_PNG6700.png",
				"http://diamondsbyfaith.com/wp-content/uploads/2013/05/Pink-diamond-rings-calleja1.jpg" };
		return images[new Random().nextInt(images.length)];

	}
}