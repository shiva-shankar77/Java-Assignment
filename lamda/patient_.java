package lamda;
import java.util.*;
@FunctionalInterface
interface PatientPrinter {
 void print(List<Integer> ids);
}

public class patient_{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     List<Integer> ids = new ArrayList<>();
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         System.out.print("Enter patient ID: ");
         ids.add(sc.nextInt());
     }
     PatientPrinter printer = list -> list.forEach(System.out::println);
     printer.print(ids);

     sc.close();
 }
}
