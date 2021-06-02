package br.com.rocha.testejava.designPattenerns.strategy;

public class Pix implements MethodPayment {
    @Override
    public String payment(double price) {
        return "Payment with pix successfuly done";
    }
}