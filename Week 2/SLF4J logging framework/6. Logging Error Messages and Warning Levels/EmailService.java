import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailService {
    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    public void sendWelcomeEmail(String email) {
        logger.debug("Preparing to send welcome email to {}", email);

        logger.info("Welcome email sent to {}", email);
    }
}
