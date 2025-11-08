import com.ameerdev.PaymentProvider;
import com.ameerdev.adaptors.PaypalAdaptor;
import com.ameerdev.adaptors.SquareAdaptor;
import com.ameerdev.adaptors.StripeAdaptor;

void main() {
    List<PaymentProvider> providers = new ArrayList<>(List.of(
            new PaypalAdaptor("ameeryabdallah1@gmail.com"),
            new StripeAdaptor("Ameer Abdallah", "4242424242424242", "12/34")
    ));

    double amount = 100.00;
    for (PaymentProvider provider : providers) {
        provider.processPayment(amount);
    }

    // Part 2: Adding Square Adaptor
    providers.add(new SquareAdaptor("LOC123"));
    for (PaymentProvider provider : providers) {
        provider.processPayment(amount);
    }
}
