package nl.isaac.devblog.aws.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AWSLoggingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AWSLoggingService.class);

    public void log() {
        for (int i = 0; i < 10; i++) {
            LOGGER.info("The number i = " + i);
        }

        try {
            throw new RuntimeException("Some runtime error");
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
}
