package services.helpers;

public class Sanitizer {
	
	public static String sanitize(String str) {
		if (str == null || str.equalsIgnoreCase("null"))
			return "";
		return str;
	}

}
