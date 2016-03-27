package models;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"thumb", "img" })
public class Image extends Model {

	@Override
	public String toString() {
		return "Image [id=" + super.getId() + ", thumb=" + thumb + ", img=" + img + "]";
	}

	@JsonProperty("thumb")
	private String thumb;
	@JsonProperty("img")
	private String img;
	
	public Image() {
	}
	
	public Image(String thumb, String img) {
		super();
		this.thumb = thumb;
		this.img = img;
	}

	/**
	 * 
	 * @return The thumb
	 */
	@JsonProperty("thumb")
	public String getThumb() {
		return thumb;
	}

	/**
	 * 
	 * @param thumb
	 *            The thumb
	 */
	@JsonProperty("thumb")
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	/**
	 * 
	 * @return The img
	 */
	@JsonProperty("img")
	public String getImg() {
		return img;
	}

	/**
	 * 
	 * @param img
	 *            The img
	 */
	@JsonProperty("img")
	public void setImg(String img) {
		this.img = img;
	}
}