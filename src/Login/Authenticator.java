package Login;

public class Authenticator {

	public String authenticate(String username, String password){
		if(("prasad".equals(username)&& ("password").equals(password))){
			return "sucess";
			
			
		}else{
			return "failure";
		}
	}
}
