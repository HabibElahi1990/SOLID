package DependencyInversionPrinciple.withUsePrinciple;

public class Demo {

    /*
    by use Sender interface we bread dependency between SendMessage and Sms or Mail
     */
    public static void main(String[] args) {
        Sender sender=new SmsSender();
        SendMessage sendMessage=new SendMessage(sender);
        sendMessage.send();
    }
}
