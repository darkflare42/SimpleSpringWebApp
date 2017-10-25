package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import webapp.LoginService;

@Controller
@ComponentScan("webapp")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String showLoginPage(){
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String doPost(@RequestParam String name,
                         @RequestParam String password,
                         ModelMap modelMap){
        if(!loginService.validateUser(name, password)){
            modelMap.put("errorMessage", "Wrong credentials");
            return "login";
        }
        else{
            modelMap.put("name", name);
            modelMap.put("password", password);
            return "welcome";
        }






    }
}
