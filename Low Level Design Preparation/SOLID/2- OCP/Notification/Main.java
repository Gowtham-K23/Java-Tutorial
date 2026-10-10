public class Main 
{
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        email.sendMessage("Bala", "Check this project as soon as possible");
        
        Notification sms = new SMSNotification();
        sms.sendMessage("Bala", "Solve this bug with EOD");
        
        Notification push = new PushNotification();
        push.sendMessage("Bala", "GitHub repository have changes. Check it out.");
        
        Notification whatsapp = new WhatsappNotification();
        whatsapp.sendMessage("Bala", "Join the meeting at sharp 3pm");
    }    
}
