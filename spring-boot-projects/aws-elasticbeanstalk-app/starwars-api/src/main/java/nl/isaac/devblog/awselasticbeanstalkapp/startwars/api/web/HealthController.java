package nl.isaac.devblog.awselasticbeanstalkapp.startwars.api.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {
    @RequestMapping
    public String healthy() {
        return "healthy";
    }
}
