package databases;

import java.util.HashMap;
import java.util.Map;

import models.Gem;

public class Database {
	
	private static Map<Integer, Gem> gems = new HashMap<Integer, Gem>();

	public static Map<Integer, Gem> getGems() {
		return gems;
	}

}
