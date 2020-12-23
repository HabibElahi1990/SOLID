package DependencyInversionPrinciple.withoutUsePrinciple;

public class Demo {

    /*
    for sending message we have to identify type of send
     */
    public static void main(String[] args) {
        SmsSender smsSender=new SmsSender();
        SendMessage sendMessage=new SendMessage(smsSender);
        sendMessage.sendMessage();
    }
}
