public class SMSNotification implements Notification{
    public void sendMessage(String recipient, String message)
    {
        System.out.println("Recipient Name: " + recipient);
        System.out.println("Content / Body: " + message);
        System.out.println("Transfer medium: SMS\n");
    }
}