package DependencyInversionPrinciple.withUsePrinciple;

public class MailSender implements Sender{

    public void send(){
        System.out.println("send mail");
    }

}
