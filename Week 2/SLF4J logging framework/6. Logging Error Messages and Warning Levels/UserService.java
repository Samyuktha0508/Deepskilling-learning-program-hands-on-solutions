import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private EmailService emailService = new EmailService();

    public void registerUser(String email) {
        logger.info("Starting user registration...");

        try {
            if (email == null || email.isEmpty()) {
                logger.warn("Email is empty or null.");
                throw new IllegalArgumentException("Email cannot be null or empty");
            }

            logger.debug("Email validated: {}", email);
            logger.info("Registering user with email: {}", email);

            emailService.sendWelcomeEmail(email);

            logger.info("User registered successfully.");
        } catch (Exception e) {
            logger.error("User registration failed: {}", e.getMessage(), e);
        }
    }
}
