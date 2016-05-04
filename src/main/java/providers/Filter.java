package providers;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class Filter implements ContainerRequestFilter, ContainerResponseFilter{
	
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("Request:: URL: " + requestContext.getUriInfo().getAbsolutePath() + ", MethodType: " + requestContext.getMethod());
	}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		_accessControlAllowAll(responseContext);
		System.out.println("Response:: Status: " + responseContext.getStatus() + ", Response: " + responseContext.getEntity());
	}
	
	private void _accessControlAllowAll(ContainerResponseContext responseContext){
		responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
		responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
		responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
		responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		responseContext.getHeaders().add("Access-Control-Max-Age", "1209600");
	}

}
