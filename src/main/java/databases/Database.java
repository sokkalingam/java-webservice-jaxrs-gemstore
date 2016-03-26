package databases;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import models.Gem;

public class Database {
	
	private static Map<Integer, Gem> gems = new ConcurrentHashMap<Integer, Gem>();

	public static Map<Integer, Gem> getGems() {
		return gems;
	}

}
