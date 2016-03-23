package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Gem {
	
	private String name;
	private Double price;
	private String specification;
	private String description;
	private List<String> imageUrls = new ArrayList<String>();
	private Map<String, List<Review>> reviews = new HashMap<String, List<Review>>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}
	public Map<String, List<Review>> getReviews() {
		return reviews;
	}
	public void setReviews(Map<String, List<Review>> reviews) {
		this.reviews = reviews;
	}
}
