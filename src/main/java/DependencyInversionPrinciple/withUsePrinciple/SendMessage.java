package DependencyInversionPrinciple.withUsePrinciple;

/*
we have to create constructor for any sender
 */
public class SendMessage {

    private Sender sender;

    SendMessage(Sender sender){
        this.sender=sender;
    }

    public void send(){
        sender.send();
    }

}
