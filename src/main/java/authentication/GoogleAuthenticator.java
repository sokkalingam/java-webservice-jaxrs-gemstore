package authentication;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import models.GoogleToken;

public class GoogleAuthenticator {
	
	private Client client;
	private final String url;
	private final String iss;
	private final String aud;
	
	public GoogleAuthenticator() {
		client = ClientBuilder.newClient();
		url = "https://www.googleapis.com/oauth2/v3/tokeninfo";
		iss = "accounts.google.com";
		aud = "237383054276-0jmo0pn3l3oqqs0olo3bm65hnf4a3gia.apps.googleusercontent.com";
	}
	
	public static void main(String[] args) {
		GoogleAuthenticator auth = new GoogleAuthenticator();
		GoogleToken googleToken = auth.authorize("eyJhbGciOiJSUzI1NiIsImtpZCI6ImM5YmNkMGNjZjU5Yzc4OTI3MzBlNzY1ZmM3NTYzZjU2ZGMwMmJkOWUifQ.eyJpc3MiOiJhY2NvdW50cy5nb29nbGUuY29tIiwiYXRfaGFzaCI6ImMtNkJNdnRsY3JmLVVUVmhOQVh3SlEiLCJhdWQiOiIyMzczODMwNTQyNzYtMGptbzBwbjNsM29xcXMwb2xvM2JtNjVobmY0YTNnaWEuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJzdWIiOiIxMTIyODkxMzAyOTkyOTUzMDIxNDgiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiYXpwIjoiMjM3MzgzMDU0Mjc2LTBqbW8wcG4zbDNvcXFzMG9sbzNibTY1aG5mNGEzZ2lhLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiZW1haWwiOiJsaW5nczI0QGdtYWlsLmNvbSIsImlhdCI6MTQ2MjU4NzY5MCwiZXhwIjoxNDYyNTkxMjkwLCJuYW1lIjoiU29ra2FsaW5nYW0gUyBTdWJyYW1hbmlhbiIsInBpY3R1cmUiOiJodHRwczovL2xoNS5nb29nbGV1c2VyY29udGVudC5jb20vLUdReGtGSnRqUWRvL0FBQUFBQUFBQUFJL0FBQUFBQUFBQk44L3VOMkpuWnVXZHRvL3M5Ni1jL3Bob3RvLmpwZyIsImdpdmVuX25hbWUiOiJTb2trYWxpbmdhbSIsImZhbWlseV9uYW1lIjoiUyBTdWJyYW1hbmlhbiIsImxvY2FsZSI6ImVuIn0.sZSSUGDWpZ7xmu0TdO62toUHSRLAq3bc8XCaDyffkqqOzNRo_sNRJ6BYQnLlldDWP8FlKcY1HVH3mECV-66UaAf_fqVhfNTkh4ntIQlv3b_wWVCTmRDsdvzaM3avtJRSgICLbe9XctDIxmKldCPnVBSSArFrj7blrtPcE_TeYNoe5ELRCY7XD_a2bi2V7Jm0ygfsuDeWsXrcKUkolqbF1Y2AfjGZAH7pyeZErRQIxtYeOD42nlZ_WlwAn78DO-MB5BWnfTWOgxUe31hKfoRbNVNp4v7dvg_J_CfTdakVp_W4ZTPDm8O5oFG-jtw4NyY_SofJRM2kr5VbIItBalav6w");
		
		if (googleToken != null)
			System.out.println(googleToken);
		else
			System.out.println("Not Authorized");
	}
	
	public GoogleToken authorize(String idToken) {
		
		WebTarget target = client.target(url).queryParam("id_token", idToken);
		GoogleToken googleToken = target.request().get(GoogleToken.class);
		
		if (googleToken != null && googleToken.getIss().equals(iss) &&
				googleToken.getAud().equals(aud) &&
				googleToken.getEmailVerified().equals("true"))
			return googleToken;
		
		return null;
	}

}
