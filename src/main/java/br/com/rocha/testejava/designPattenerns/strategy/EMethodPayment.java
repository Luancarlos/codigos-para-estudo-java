package br.com.rocha.testejava.designPattenerns.strategy;

public enum EMethodPayment {
    CREDITCARD {
        @Override
        public MethodPayment getMethodPayment() {
            return new CreditCard();
        }
    },
    DEBITCARD {
        @Override
        public MethodPayment getMethodPayment() {
            return new DebitCard();
        }
    },
    PIX {
        @Override
        public MethodPayment getMethodPayment() {
            return new Pix();
        }
    },
    BANKSLIP {
        @Override
        public MethodPayment getMethodPayment() {
            return new BankSlip();
        }
    };

    public abstract MethodPayment getMethodPayment();
}
