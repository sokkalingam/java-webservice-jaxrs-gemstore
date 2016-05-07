package services;

import authentication.GoogleAuthenticator;
import models.GoogleToken;

public class AuthService {
	
	private GoogleAuthenticator googleAuthenticator = new GoogleAuthenticator();
	
	public GoogleToken googleAuth(String idToken) {
		return googleAuthenticator.authorize(idToken);
	}

}
