package authentication;

import java.util.Arrays;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;

public class GoogleAuthenticator {
	
	public boolean verify() {
		
		String CLIENT_ID = "237383054276-0jmo0pn3l3oqqs0olo3bm65hnf4a3gia.apps.googleusercontent.com";
		
		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(null)
			    .setAudience(Arrays.asList(CLIENT_ID))
			    .setIssuer("accounts.google.com")
			    .build();
		
		
		
		return false;
	}

}
