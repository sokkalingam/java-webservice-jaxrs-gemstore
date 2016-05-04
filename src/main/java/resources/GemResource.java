package resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import models.Gem;
import models.review.GemReview;
import models.review.Review;
import services.GemService;

@Path("/gems")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GemResource {
	
	private GemService gemService = new GemService();
	
	@GET
	public Response getAllGems(@Context UriInfo uriInfo) {
		return ResourceHelper.getResponse(gemService.searchGems(uriInfo));
	}
	
	public Response getAllGems() {
		return ResourceHelper.getResponse(gemService.getAllGems());
	}
	
	@GET
	@Path("/{id}")
	public Response getGem(@PathParam("id") Integer id) {
		return ResourceHelper.getResponse(gemService.getGem(id));
	}
	
	@POST
	public Response addGem(Gem gem) {
		return ResourceHelper.getResponse(gemService.addGem(gem));
	}
	
	@PUT
	@Path("/{id}")
	public Response updateGem(@PathParam("id") Integer id, Gem gem) {
		return ResourceHelper.getResponse(gemService.updateGem(id, gem));
	}
	
	@DELETE
	@Path("/{id}")
	public void deleteGem(@PathParam("id") Integer id) {
		gemService.deleteGem(id);
	}
	
	@GET
	@Path("/cart")
	public Response getGemsInCart() {
		return ResourceHelper.getResponse(gemService.getGemsInCart());
	}
	
	@POST
	@Path("/{id}/addToCart")
	public Response addToCart(@PathParam("id") Integer id) {
		return ResourceHelper.getResponse(gemService.addGemToCart(id));
	}
	
	@POST
	@Path("/{id}/removeFromCart")
	public Response removeFromCart(@PathParam("id") Integer id) {
		return ResourceHelper.getResponse(gemService.removeGemFromCart(id));
	}
	
	@POST
	@Path("/{id}/checkout")
	public Response checkout(@PathParam("id") Integer id) {
		return ResourceHelper.getResponse(gemService.checkout(id));
	}
	
	@POST
	@Path("/checkoutList")
	public Response checkout(@QueryParam("id") List<Integer> ids) {
		return ResourceHelper.getResponse(gemService.checkoutList(ids));
	}
	
	@Path("/{gemId}/reviews")
	public ReviewResource getReviews() {
		return new ReviewResource();
	}
	
	/*
	 * Test methods
	 */
	@GET
	@Path("/populate/{gems}/{reviews}")
	public Response populate(@PathParam("gems") Integer noOfGems, @PathParam("reviews") Integer noOfReviews) {
		List<Gem> gems = new ArrayList<Gem>(noOfGems);
		
		for (int i=0; i < noOfGems; i++) {
			Gem gem = Gem.generateModel();
			
			List<Review> reviews = new ArrayList<Review>(noOfReviews);
			for (int j = 0; j < noOfReviews; j++)
				reviews.add(Review.generateRandomModel());
			
			GemReview gemReview = new GemReview();
			gemReview.setReviews(reviews);
			gem.setGemReview(gemReview);
			gems.add(gem);
		}
		
		gemService.addGems(gems);
		gems = gemService.getAllGems();

		return ResourceHelper.getResponse(gems);
	}
}
