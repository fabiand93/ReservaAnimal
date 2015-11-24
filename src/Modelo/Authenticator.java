package Modelo;

public class Authenticator {
	public String authenticate(String username, String password) {
		if (("usuario".equalsIgnoreCase(username))
				&& ("password".equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
}
