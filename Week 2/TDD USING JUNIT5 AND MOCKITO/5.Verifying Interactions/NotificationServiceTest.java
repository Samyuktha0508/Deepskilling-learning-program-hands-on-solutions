import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    public void testNotifyUserSendsMessage() {
        MessageSender mockSender = mock(MessageSender.class);

        NotificationService service = new NotificationService(mockSender);

        service.notifyUser("user@example.com", "Your account was accessed.");

        verify(mockSender).send("user@example.com", "Your account was accessed.");

        System.out.println("✅ Verified: Message was sent to user@example.com.");
    }

    @Test
    public void testNotifyUserDoesNotSendIfEmailIsEmpty() {

        MessageSender mockSender = mock(MessageSender.class);
        NotificationService service = new NotificationService(mockSender);

        service.notifyUser("", "Alert");

        verify(mockSender, never()).send(anyString(), anyString());

        System.out.println("✅ Verified: Message was not sent due to empty email.");
    }
}
