package resources;

import java.net.URI;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

public class ResourceHelper {
	
	public static Response responseOk(Object object) {
		return _build(Response.ok(object));
	}
	
	public static Response responseNoContent() {
		return _build(Response.noContent());
	}
	
	public static Response responseCreated(Object object) {
		return _build(Response.created(URI.create("")).entity(object));
	}
	
	public static Response getResponse(Object object) {
		return object != null ? ResourceHelper.responseOk(object) : ResourceHelper.responseNoContent();
	}
	
	private static Response _build(ResponseBuilder responseBuilder) {
		return responseBuilder
				.header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
	            .header("Access-Control-Allow-Credentials", "true")
	            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	            .header("Access-Control-Max-Age", "1209600")
	            .build();
	}

}
