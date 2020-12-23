package DependencyInversionPrinciple.withUsePrinciple;

public class SmsSender implements Sender{

    public void send(){
        System.out.println("send sms");
    }
}
