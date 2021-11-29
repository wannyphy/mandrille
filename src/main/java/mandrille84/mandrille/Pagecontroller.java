package mandrille84.mandrille;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pagecontroller {
    @GetMapping("/")
    public String home(){
        return "pages/home";
    }
    @GetMapping("/paint")
    public String paint(){
        return "pages/paint";
    }
/*    @GetMapping("/")
    public String readCookie(@CookieValue(value = "username", defaultValue = "Atta") String username) {
        return "Hey! My username is " + username;
    }*/
}
