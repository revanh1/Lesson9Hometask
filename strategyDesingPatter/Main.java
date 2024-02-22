package Lesson9.Classwork.designPatters.strategyDesingPatter;

public class Main {
    public static void main(String[] args) {
        PaymentProcess payment1 = new PaymentProcess(new CreditCardPayment());
        payment1.proccessPayment(100.5);

        payment1.setPaymentStartegy(new PayPalPayment());
        payment1.proccessPayment(34.567);

        payment1.setPaymentStartegy(new CreditCardPayment());
        payment1.proccessPayment(56.12);
    }
}
