package webapp;

public class LoginService {
    public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("darkflare42") && password.equals("darkflare42");
	}

}