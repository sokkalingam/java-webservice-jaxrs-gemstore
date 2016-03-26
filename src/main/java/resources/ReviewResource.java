package resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.Review;
import services.ReviewService;

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
	

}
