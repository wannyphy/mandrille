package mandrille84.mandrille;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pagecontroller {
    @GetMapping("/")
    public String home(){
        return "pages/home";
    }
}
