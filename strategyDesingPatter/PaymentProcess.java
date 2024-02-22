package Lesson9.Classwork.designPatters.strategyDesingPatter;

public class PaymentProcess {
    private PaymentStartegy paymentStartegy;
    public PaymentProcess(PaymentStartegy paymentStartegy){
        this.paymentStartegy = paymentStartegy;
    }

    public void setPaymentStartegy(PaymentStartegy paymentStartegy) {
        this.paymentStartegy = paymentStartegy;
    }
    public void proccessPayment(double amount){
        paymentStartegy.processPayment(amount);
    }
}
