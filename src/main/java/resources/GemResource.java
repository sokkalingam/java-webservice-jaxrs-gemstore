package resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.Gem;
import models.Review;
import services.GemService;

@Path("/gems")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GemResource {
	
	private GemService gemService = new GemService();
	private Gem gem;
	private List<Gem> gems;
	
	@GET
	public Response getAllGems() {
		gems = gemService.getAllGems();
		return gems != null ? ResourceHelper.responseOk(gems) : ResourceHelper.responseNoContent();
	}
	
	@GET
	@Path("/{id}")
	public Response getGem(@PathParam("id") Integer id) {
		this.gem = gemService.getGem(id);
		return this.gem != null ? ResourceHelper.responseOk(gem) : ResourceHelper.responseNoContent();
	}
	
	@POST
	public Response addGem(Gem gem) {
		this.gem  = gemService.addGem(gem);
		return this.gem != null ? ResourceHelper.responseCreated(gem) : ResourceHelper.responseNoContent();
	}
	
	@PUT
	@Path("/{id}")
	public Response updateGem(@PathParam("id") Integer id, Gem gem) {
		this.gem = gemService.updateGem(id, gem);
		return this.gem != null ? ResourceHelper.responseOk(gem) : ResourceHelper.responseNoContent();
	}
	
	@DELETE
	@Path("/{id}")
	public Response deleteGem(@PathParam("id") Integer id) {
		this.gem = gemService.deleteGem(id);
		return this.gem != null ? ResourceHelper.responseOk(gem) : ResourceHelper.responseNoContent();
	}
	
	@Path("/{gemId}/reviews")
	public ReviewResource getReviews() {
		return new ReviewResource();
	}	
	
	/*
	 * Test methods
	 */
	@SuppressWarnings("unchecked")
	@GET
	@Path("/populate/{gems}/{reviews}")
	public Response populate(@PathParam("gems") Integer noOfGems, @PathParam("reviews") Integer noOfReviews) {
		for (int i = 1; i <= noOfGems; i++)
			gemService.addGem(Gem.generateModel(i));
		
		Response response = getAllGems();
		List<Gem> gems = (List<Gem>) response.getEntity();
		for (Gem gem : gems)
			for (int i = 0; i < noOfReviews; i++)
				new ReviewResource().addReview(gem.getId(), Review.generateRandomModel());
		return response;
	}
}
