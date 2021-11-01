package payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Paid %f with Credit Card\n", price);
        return true;
    }
}
