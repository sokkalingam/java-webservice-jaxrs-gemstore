package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import databases.Database;
import models.Gem;

public class GemService {
	
	private Map<String, Gem> gems = Database.getGems();
	
	public GemService() {
		Gem gem = new Gem();
		gem.setName("Ruby");
		gems.put(gem.getName(), gem);
	}
	
	public List<Gem> getAllGems() {
		return new ArrayList<Gem>(this.gems.values());
	}

}
