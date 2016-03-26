package resources;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.Gem;
import services.GemService;

@Singleton
@Path("/gems")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GemResource {
	
	private GemService gemService = new GemService();
	
	@GET
	public List<Gem> getAllGems() {
		return gemService.getAllGems();
	}
	
	@GET
	@Path("/{id}")
	public Gem getGem(@PathParam("id") Integer id) {
		return gemService.getGem(id);
	}
	
	@POST
	public Gem addGem(Gem gem) {
		return gemService.addGem(gem);
	}
	
	@PUT
	@Path("/{id}")
	public Gem updateGem(@PathParam("id") Integer id, Gem gem) {
		return gemService.updateGem(id, gem);
	}
	
	@DELETE
	@Path("/{id}")
	public Gem deleteGem(@PathParam("id") Integer id) {
		return gemService.deleteGem(id);
	}
	
	@Path("/{gemId}/reviews")
	public ReviewResource getReviews() {
		return new ReviewResource();
	}
	
	@Path("/{gemId}/images")
	public ImageResource getImages() {
		return new ImageResource();
	}
}
