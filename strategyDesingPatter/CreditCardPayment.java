package Lesson9.Classwork.designPatters.strategyDesingPatter;

public class CreditCardPayment implements PaymentStartegy {

    @Override
    public void processPayment(double amount) {
        System.out.println("proccess is done by credir card " + amount);
    }
}
