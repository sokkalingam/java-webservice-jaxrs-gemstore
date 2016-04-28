package resources;

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

import models.review.Review;
import services.ReviewService;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReviewResource {
	
	private ReviewService reviewService = new ReviewService();
	
	@GET
	public Response getReviews(@PathParam("gemId") Integer gemId) {
		return ResourceHelper.getResponse(reviewService.getGemReview(gemId));
	}
	
	@GET
	@Path("/{reviewId}")
	public Response getReview(@PathParam("gemId") Integer gemId, @PathParam("reviewId") Integer reviewId) {
		return ResourceHelper.getResponse(reviewService.getReview(gemId, reviewId));
	}
	
	@POST
	public Response addReview(@PathParam("gemId") Integer gemId, Review review){
		return ResourceHelper.getResponse(reviewService.addReview(gemId, review));
	}
	
	@PUT
	@Path("/{reviewId}")
	public Response updateReview(@PathParam("gemId") Integer gemId, @PathParam("reviewId") Integer reviewId, Review review) {
		return ResourceHelper.getResponse(reviewService.updateReview(gemId, reviewId, review));
	}
	
	@DELETE
	@Path("/{reviewId}")
	public Response deleteReview(@PathParam("gemId") Integer gemId, @PathParam("reviewId") Integer reviewId) {
		return ResourceHelper.getResponse(reviewService.deleteReview(gemId, reviewId));
	}
}
