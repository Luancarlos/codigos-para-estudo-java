package br.com.rocha.testejava.jms.activeMQ;

import lombok.SneakyThrows;

import javax.jms.*;
import javax.naming.InitialContext;
import java.util.Scanner;

public class ConsumerActiveMq {
    @SneakyThrows
    public static void main(String[] args) {
        InitialContext context = new InitialContext();

        ConnectionFactory factory = (ConnectionFactory) context.lookup("ConnectionFactory");

        Connection connection = factory.createConnection();


        connection.start();
        System.out.println("Connection with ActiveMQ");

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        //Destination destination = session.createQueue("fila.financeira");
        Destination destination = (Destination) context.lookup("financeiro");
        MessageConsumer messageConsumer = session.createConsumer(destination);

        messageConsumer.setMessageListener((Message message) -> {
            TextMessage textMessage = (TextMessage) message;
            try {
                System.out.println("Message: " + textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        });

        new Scanner(System.in).nextLine();

        connection.close();
        context.close();


    }
}
