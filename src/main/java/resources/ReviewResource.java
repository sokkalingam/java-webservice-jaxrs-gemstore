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

import models.AverageReview;
import models.Review;
import services.ReviewService;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReviewResource {
	
	private ReviewService reviewService = new ReviewService();
	
	@GET
	public List<Review> getReviews(@PathParam("gemId") Integer gemId) {
		return reviewService.getReviews(gemId);
	}
	
	@GET
	@Path("/{reviewId}")
	public Review getReview(@PathParam("gemId") Integer gemId, @PathParam("reviewId") Integer reviewId) {
		return reviewService.getReview(gemId, reviewId);
	}
	
	@POST
	public Review addReview(@PathParam("gemId") Integer gemId, Review review){
		return reviewService.addReview(gemId, review);
	}
	
	@PUT
	@Path("/{reviewId}")
	public Review updateReview(@PathParam("gemId") Integer gemId, @PathParam("reviewId") Integer reviewId, Review review) {
		return reviewService.updateReview(gemId, reviewId, review);
	}
	
	@DELETE
	@Path("/{reviewId}")
	public Review deleteReview(@PathParam("gemId") Integer gemId, @PathParam("reviewId") Integer reviewId) {
		return reviewService.deleteReview(gemId, reviewId);
	}
	
	@GET
	@Path("/averageReview")
	public AverageReview getAverageReview(@PathParam("gemId") Integer gemId) {
		return reviewService.getAverageReview(gemId);
	}
	

}
