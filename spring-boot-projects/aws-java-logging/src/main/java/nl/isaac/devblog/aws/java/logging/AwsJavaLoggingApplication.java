package nl.isaac.devblog.aws.java.logging;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwsJavaLoggingApplication {
    AWSLoggingService awsLoggingService;

    public AwsJavaLoggingApplication(final AWSLoggingService awsLoggingService) {
        this.awsLoggingService = awsLoggingService;
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AwsJavaLoggingApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> awsLoggingService.log();
    }
}
