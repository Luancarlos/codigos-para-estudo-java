package br.com.rocha.testejava.jms;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void consumerMessage(Email email) {
        System.out.println("Reveiver < " + email + ">");
    }
}
