package Java_elements;
import java.util.*;
public class fee_discount_with_user_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fee=sc.nextDouble();
		double disount_percentage=sc.nextDouble();
		double discount_amount=(disount_percentage/100)*fee;
		double final_fee=fee-discount_amount;
		System.out.println("The discount amount is INR "+discount_amount+" and final discounted fee is INR "+final_fee);
		sc.close();
	}
}
