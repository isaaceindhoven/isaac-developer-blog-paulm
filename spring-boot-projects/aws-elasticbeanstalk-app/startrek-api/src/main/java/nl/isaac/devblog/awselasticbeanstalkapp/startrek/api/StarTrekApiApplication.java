package nl.isaac.devblog.awselasticbeanstalkapp.startrek.api;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarTrekApiApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StarTrekApiApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
