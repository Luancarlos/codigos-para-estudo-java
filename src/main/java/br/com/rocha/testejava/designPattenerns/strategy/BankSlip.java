package br.com.rocha.testejava.designPattenerns.strategy;

public class BankSlip implements MethodPayment {
    @Override
    public String payment(double price) {
        return "Payment with bank slip successfuly done";
    }
}
