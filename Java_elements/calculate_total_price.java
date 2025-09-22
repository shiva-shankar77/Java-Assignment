package Java_elements;
import java.util.*;
public class calculate_total_price {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unitprice = sc.nextInt();
		int quantity = sc.nextInt();
		System.out.println("The total purchase price is INR "+unitprice+" if the quantity "+quantity+" and unit price is INR "+(unitprice*quantity));
	    sc.close();
	    
	}
}
