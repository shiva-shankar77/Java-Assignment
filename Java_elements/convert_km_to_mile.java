package Java_elements;
import java.util.*;
public class convert_km_to_mile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		double mile=km/1.6;
		System.out.println(mile);
		sc.close();
	}

}
