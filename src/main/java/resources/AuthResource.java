package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import services.AuthService;

@Path("/authorize")
@Produces(MediaType.APPLICATION_JSON)
public class AuthResource {
	
	private AuthService authService = new AuthService();
	
	@GET
	@Path("/google")
	public Response googleAuth(@QueryParam("token") String idToken) {
		return ResourceHelper.getResponse(authService.googleAuth(idToken));
	}

}
