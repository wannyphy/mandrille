package mandrille84.mandrille;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pagecontroller {
    @GetMapping("/home")
    public String home() {
        return "pages/home";
    }

    @GetMapping("/paint")
    public String paint() {
        return "pages/paint";
    }

    @GetMapping("/illustration")
    public String illustration() {
        return "pages/illustrations";
    }

    @GetMapping("/wallpaint")
    public String wallpaint() {
        return "pages/wallpaint";
    }

    @GetMapping("/wait")
    public String waiting() {
        return "pages/wait";
    }
    @GetMapping("/contact")
    public String waitcontact() {
        return "pages/contact";
    }
    @Controller
    @PropertySource(ignoreResourceNotFound = true , value = "classpath:messages.properties")
    public class HomePageController {


    }

/*    @GetMapping("/")
    public String readCookie(@CookieValue(value = "username", defaultValue = "Atta") String username) {
        return "Hey! My username is " + username;
    }*/
}
