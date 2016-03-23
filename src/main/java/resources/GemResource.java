package resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.Gem;
import services.GemService;

@Path("/gems")
public class GemResource {
	
	private GemService gemService = new GemService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Gem> getAllGems() {
		return gemService.getAllGems();
	}

}
