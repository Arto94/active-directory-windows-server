package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome to the Admin page!";
    }
}
