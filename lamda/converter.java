package lamda;
import java.util.*;
import java.util.stream.Collectors;

// Functional Interface
@FunctionalInterface
interface NameConverter {
    List<String> convert(List<String> names);
}

public class converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }
        NameConverter converter = list -> list.stream()
                                              .map(String::toUpperCase)
                                              .collect(Collectors.toList());

        System.out.println("\nNames in Uppercase:");
        converter.convert(names).forEach(System.out::println);

        sc.close();
    }
}
