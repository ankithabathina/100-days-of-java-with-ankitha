// StrategyPatternDemo.java

// Strategy Interface
interface PaymentStrategy {
    void pay(double amount);
}

// Concrete Strategy - Credit Card
class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("💳 Payment of ₹" + amount + " made using Credit Card.");
    }
}

// Concrete Strategy - UPI
class UpiPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("📱 Payment of ₹" + amount + " made using UPI.");
    }
}

// Concrete Strategy - PayPal
class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("🌐 Payment of ₹" + amount + " made using PayPal.");
    }
}

// Context Class
class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("Please select a payment method.");
        }
    }
}

// Main Class
public class StrategyPatternDemo {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        // Credit Card Payment
        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(1500);

        System.out.println();

        // UPI Payment
        context.setPaymentStrategy(new UpiPayment());
        context.makePayment(750);

        System.out.println();

        // PayPal Payment
        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(2500);
    }
}
