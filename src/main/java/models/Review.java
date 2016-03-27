package models;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"stars", "body", "author" })
public class Review extends Model {
	
	@Override
	public String toString() {
		return "Review [stars=" + stars + ", body=" + body + ", author=" + author + "]";
	}

	public Review() {
	}

	public Review(Integer stars, String body, String author) {
		super();
		this.stars = stars;
		this.body = body;
		this.author = author;
	}

	@JsonProperty("stars")
	private Integer stars;
	@JsonProperty("body")
	private String body;
	@JsonProperty("author")
	private String author;

	/**
	 * 
	 * @return The stars
	 */
	@JsonProperty("stars")
	public Integer getStars() {
		return stars;
	}

	/**
	 * 
	 * @param stars
	 *            The stars
	 */
	@JsonProperty("stars")
	public void setStars(Integer stars) {
		this.stars = stars;
	}

	/**
	 * 
	 * @return The body
	 */
	@JsonProperty("body")
	public String getBody() {
		return body;
	}

	/**
	 * 
	 * @param body
	 *            The body
	 */
	@JsonProperty("body")
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * 
	 * @return The author
	 */
	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	/**
	 * 
	 * @param author
	 *            The author
	 */
	@JsonProperty("author")
	public void setAuthor(String author) {
		this.author = author;
	}
}