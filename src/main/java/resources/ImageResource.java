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

import models.Image;
import services.ImageService;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ImageResource {
	
	private ImageService imageService = new ImageService();
	
	@GET
	public List<Image> getImages(@PathParam("gemId") Integer gemId) {
		return imageService.getImages(gemId);
	}
	
	@GET
	@Path("/{imageId}")
	public Image getImage(@PathParam("gemId") Integer gemId, @PathParam("imageId") Integer imageId) {
		return imageService.getImage(gemId, imageId);
	}
	
	@POST
	public Image addImage(@PathParam("gemId") Integer gemId, Image image){
		return imageService.addImage(gemId, image);
	}
	
	@PUT
	@Path("/{imageId}")
	public Image updateImage(@PathParam("gemId") Integer gemId, @PathParam("imageId") Integer imageId, Image image) {
		return imageService.updateImage(gemId, imageId, image);
	}
	
	@DELETE
	@Path("/{imageId}")
	public Image deleteImage(@PathParam("gemId") Integer gemId, @PathParam("imageId") Integer imageId) {
		return imageService.deleteImage(gemId, imageId);
	}

}
