public class AdapterPatternTest {
    public static void main(String[] args) {
        // Using Stripe Payment Gateway
        StripePaymentGateway stripe = new StripePaymentGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(100.0);

        // Using PayPal Payment Gateway
        PayPalPaymentGateway paypal = new PayPalPaymentGateway();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(200.0);
    }
}
