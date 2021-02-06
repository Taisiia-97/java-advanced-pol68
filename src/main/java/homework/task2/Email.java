package homework.task2;

import java.util.regex.Pattern;

public class Email extends Message{
    final String  emailAddress;
    final String subject;

    public Email(String content) {
        super(content);
        emailAddress = "";
        subject = "";
    }

    public Email(String content, String emailAddress, String subject) {
        super(content);
        this.emailAddress = emailAddress;
        this.subject = subject;
    }
@Override
public  boolean canSend(){
       if(emailAddress==null || subject == null) return false;
        return super.canSend() && Pattern.matches("[0-9a-zA-Z][\\dA-z-_.]+@([A-z\\d][A-z\\d-]+\\.){1,6}[A-z]{2,6}",emailAddress)
              &&  Pattern.matches(".*",subject);
}

    @Override
    public String send() {
        if(canSend()) return "Mail o treści " +  getContent()+" zostal wysłany na adres "+ this.emailAddress;
        return "Mail nie może zostać wysłany.";
    }

}
