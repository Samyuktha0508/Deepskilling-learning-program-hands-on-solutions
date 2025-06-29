public class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String userEmail, String alertMessage) {
        if (userEmail != null && !userEmail.isEmpty()) {
            sender.send(userEmail, alertMessage);
        }
    }
}
