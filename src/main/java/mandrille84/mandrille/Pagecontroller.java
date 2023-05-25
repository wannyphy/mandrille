package mandrille84.mandrille;


import mandrille84.mandrille.services.PaintingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Pagecontroller {
@Autowired
    PaintingServices paintingServices;

    @GetMapping("/")
    public String home() {
        return "pages/home";
    }

    @GetMapping("/paint")
    public String paint(Model model) {
        model.addAttribute("painting",paintingServices.name());
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

    @GetMapping("/copyright")
    public String  copyright() {
        return "pages/copyright";
    }

    @GetMapping("/expo")
    public String  expo() {
        return "pages/expo";
    }


/*    @GetMapping("/")
    public String readCookie(@CookieValue(value = "username", defaultValue = "Atta") String username) {
        return "Hey! My username is " + username;
    }*/
}
