package lamda;
import java.util.*;
import java.util.stream.Collectors;

// Functional Interface
@FunctionalInterface
interface InvoiceCreator {
    Invoice create(String transactionId);
}
class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}

public class invoice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> transactionIds = new ArrayList<>();

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

       for (int i = 0; i < n; i++) {
            System.out.print("Enter transaction ID " + (i + 1) + ": ");
            transactionIds.add(sc.nextLine());
        }
        InvoiceCreator creator = Invoice::new;
 List<Invoice> invoices = transactionIds.stream()
                                               .map(creator::create)
                                               .collect(Collectors.toList());

       invoices.forEach(System.out::println);

        sc.close();
    }
}
