package nl.isaac.devblog.awselasticbeanstalkapp.startwars.api;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarWarsApiApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StarWarsApiApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
