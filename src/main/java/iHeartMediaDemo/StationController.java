package iHeartMediaDemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class StationController {

    @RequestMapping("/")
    public String index() {
        return "Bare Bones Route Test\n";
    }
}
