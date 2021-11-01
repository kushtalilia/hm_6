package payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public String pay(double price) {
        return "Paid %f with Credit Card\n"+ price;
    }
}
