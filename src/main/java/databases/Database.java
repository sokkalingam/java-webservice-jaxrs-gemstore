package databases;

import java.util.HashMap;
import java.util.Map;

import models.Gem;

public class Database {
	
	private static Map<String, Gem> gems = new HashMap<String, Gem>();

	public static Map<String, Gem> getGems() {
		return gems;
	}

}
