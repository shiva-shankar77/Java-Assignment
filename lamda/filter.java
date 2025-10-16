package lamda;

import java.util.*;
import java.util.function.Predicate;

// Functional Interface
@FunctionalInterface
interface AlertFilter {
    Predicate<Alert> getFilter();
}

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class filter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Alert> alerts = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();

        // take user input for alerts
        for (int i = 0; i < n; i++) {
           
            String type = sc.nextLine();
            System.out.print("Message: ");
            String message = sc.nextLine();
            alerts.add(new Alert(type, message));
        }
        String preference = sc.nextLine().toLowerCase();
        AlertFilter filter = () -> alert -> alert.type.equalsIgnoreCase(preference);
        alerts.stream()
              .filter(filter.getFilter())
              .forEach(System.out::println);

        sc.close();
    }
}

