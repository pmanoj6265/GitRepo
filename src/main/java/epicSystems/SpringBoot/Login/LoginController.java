package epicSystems.SpringBoot.Login;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class LoginController {

	@RequestMapping("/Epicusers")
	
	public List<LoginModel> getAllusers() {
		 
		return Arrays.asList(
		
	new LoginModel ("venkatesh92","venki123"),
	new LoginModel ("kranthi93" , "kranthi123"),
	new LoginModel ("Manoj93", "manoj123"),
	new LoginModel ("Harsha93", "harsha123"),
	new LoginModel ("Anoop93", "Anoop123")
	);
	
	}
	
}