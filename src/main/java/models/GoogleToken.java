package models;

import java.util.HashMap;
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
@JsonPropertyOrder({
		"iss",
		"at_hash",
		"aud",
		"sub",
		"email_verified",
		"azp",
		"email",
		"iat",
		"exp",
		"name",
		"picture",
		"given_name",
		"family_name",
		"locale",
		"alg",
		"kid" })
public class GoogleToken {

	@JsonProperty("iss")
	private String iss;
	@JsonProperty("at_hash")
	private String atHash;
	@JsonProperty("aud")
	private String aud;
	@JsonProperty("sub")
	private String sub;
	@JsonProperty("email_verified")
	private String emailVerified;
	@JsonProperty("azp")
	private String azp;
	@JsonProperty("email")
	private String email;
	@JsonProperty("iat")
	private String iat;
	@JsonProperty("exp")
	private String exp;
	@JsonProperty("name")
	private String name;
	@JsonProperty("picture")
	private String picture;
	@JsonProperty("given_name")
	private String givenName;
	@JsonProperty("family_name")
	private String familyName;
	@JsonProperty("locale")
	private String locale;
	@JsonProperty("alg")
	private String alg;
	@JsonProperty("kid")
	private String kid;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The iss
	 */
	@JsonProperty("iss")
	public String getIss() {
		return iss;
	}

	/**
	 * 
	 * @param iss
	 *            The iss
	 */
	@JsonProperty("iss")
	public void setIss(String iss) {
		this.iss = iss;
	}

	/**
	 * 
	 * @return The atHash
	 */
	@JsonProperty("at_hash")
	public String getAtHash() {
		return atHash;
	}

	/**
	 * 
	 * @param atHash
	 *            The at_hash
	 */
	@JsonProperty("at_hash")
	public void setAtHash(String atHash) {
		this.atHash = atHash;
	}

	/**
	 * 
	 * @return The aud
	 */
	@JsonProperty("aud")
	public String getAud() {
		return aud;
	}

	/**
	 * 
	 * @param aud
	 *            The aud
	 */
	@JsonProperty("aud")
	public void setAud(String aud) {
		this.aud = aud;
	}

	/**
	 * 
	 * @return The sub
	 */
	@JsonProperty("sub")
	public String getSub() {
		return sub;
	}

	/**
	 * 
	 * @param sub
	 *            The sub
	 */
	@JsonProperty("sub")
	public void setSub(String sub) {
		this.sub = sub;
	}

	/**
	 * 
	 * @return The emailVerified
	 */
	@JsonProperty("email_verified")
	public String getEmailVerified() {
		return emailVerified;
	}

	/**
	 * 
	 * @param emailVerified
	 *            The email_verified
	 */
	@JsonProperty("email_verified")
	public void setEmailVerified(String emailVerified) {
		this.emailVerified = emailVerified;
	}

	/**
	 * 
	 * @return The azp
	 */
	@JsonProperty("azp")
	public String getAzp() {
		return azp;
	}

	/**
	 * 
	 * @param azp
	 *            The azp
	 */
	@JsonProperty("azp")
	public void setAzp(String azp) {
		this.azp = azp;
	}

	/**
	 * 
	 * @return The email
	 */
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 *            The email
	 */
	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return The iat
	 */
	@JsonProperty("iat")
	public String getIat() {
		return iat;
	}

	/**
	 * 
	 * @param iat
	 *            The iat
	 */
	@JsonProperty("iat")
	public void setIat(String iat) {
		this.iat = iat;
	}

	/**
	 * 
	 * @return The exp
	 */
	@JsonProperty("exp")
	public String getExp() {
		return exp;
	}

	/**
	 * 
	 * @param exp
	 *            The exp
	 */
	@JsonProperty("exp")
	public void setExp(String exp) {
		this.exp = exp;
	}

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
	 * @return The picture
	 */
	@JsonProperty("picture")
	public String getPicture() {
		return picture;
	}

	/**
	 * 
	 * @param picture
	 *            The picture
	 */
	@JsonProperty("picture")
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * 
	 * @return The givenName
	 */
	@JsonProperty("given_name")
	public String getGivenName() {
		return givenName;
	}

	/**
	 * 
	 * @param givenName
	 *            The given_name
	 */
	@JsonProperty("given_name")
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * 
	 * @return The familyName
	 */
	@JsonProperty("family_name")
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * 
	 * @param familyName
	 *            The family_name
	 */
	@JsonProperty("family_name")
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * 
	 * @return The locale
	 */
	@JsonProperty("locale")
	public String getLocale() {
		return locale;
	}

	/**
	 * 
	 * @param locale
	 *            The locale
	 */
	@JsonProperty("locale")
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * 
	 * @return The alg
	 */
	@JsonProperty("alg")
	public String getAlg() {
		return alg;
	}

	/**
	 * 
	 * @param alg
	 *            The alg
	 */
	@JsonProperty("alg")
	public void setAlg(String alg) {
		this.alg = alg;
	}

	/**
	 * 
	 * @return The kid
	 */
	@JsonProperty("kid")
	public String getKid() {
		return kid;
	}

	/**
	 * 
	 * @param kid
	 *            The kid
	 */
	@JsonProperty("kid")
	public void setKid(String kid) {
		this.kid = kid;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "GoogleToken [iss="
				+ iss
				+ ", aud="
				+ aud
				+ ", sub="
				+ sub
				+ ", emailVerified="
				+ emailVerified
				+ ", email="
				+ email
				+ ", name="
				+ name
				+ ", picture="
				+ picture
				+ ", givenName="
				+ givenName
				+ "]";
	}

}
