public class WhatsappNotification implements Notification{
    public void sendMessage(String recipient, String message)
    {
        System.out.println("Recipient Name: " + recipient);
        System.out.println("Content / Body: " + message);
        System.out.println("Transfer medium: Whatsapp\n");
    }
}