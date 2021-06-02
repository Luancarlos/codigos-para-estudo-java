package br.com.rocha.testejava.designPattenerns.strategy;

public class DebitCard implements MethodPayment {
    @Override
    public String payment(double price) {
        return "Payment with debit card successfuly done";
    }
}