package br.com.rocha.testejava.designPattenerns.strategy;

public class CreditCard implements MethodPayment {
    @Override
    public String payment(double price) {
        return "Payment with credit card successfuly done";
    }
}
