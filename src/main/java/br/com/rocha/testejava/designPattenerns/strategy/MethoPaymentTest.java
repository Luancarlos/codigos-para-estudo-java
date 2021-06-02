package br.com.rocha.testejava.designPattenerns.strategy;

public class MethoPaymentTest {
    public static void main(String[] args) {
//        MethodPayment methodPayment = EMethodPayment.CREDITCARD.getMethodPayment();
//        MethodPayment methodPayment = EMethodPayment.DEBITCARD.getMethodPayment();
//        MethodPayment methodPayment = EMethodPayment.PIX.getMethodPayment();
        MethodPayment methodPayment = EMethodPayment.BANKSLIP.getMethodPayment();


        System.out.println(methodPayment.payment(1000));

    }
}
