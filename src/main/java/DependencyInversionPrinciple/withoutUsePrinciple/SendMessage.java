package DependencyInversionPrinciple.withoutUsePrinciple;

/*
we have to create constructor for any sender
 */
public class SendMessage {
    private SmsSender smsSender;
    private MailSender mailSender;

    public SendMessage(SmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public SendMessage(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMessage(){
        if (smsSender!=null){
            smsSender.send();
        }
        if (mailSender!=null){
            mailSender.send();
        }
    }

}
