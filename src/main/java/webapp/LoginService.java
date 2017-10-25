package webapp;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("darkflare42") && password.equals("darkflare42");
	}

}