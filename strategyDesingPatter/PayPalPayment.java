package Lesson9.Classwork.designPatters.strategyDesingPatter;

public class PayPalPayment implements PaymentStartegy{
    @Override
    public void processPayment(double amount) {
        System.out.println("proccess id done by payPal: " + amount);
    }
}
