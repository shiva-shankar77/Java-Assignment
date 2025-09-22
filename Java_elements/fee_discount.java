package Java_elements;

public class fee_discount {
	public static void main(String[] args) {
		double fee=125000;
		double disount_percentage=10;
		double discount_amount=(disount_percentage/100)*fee;
		double final_fee=fee-discount_amount;
		System.out.println("The discount amount is INR "+discount_amount+" and final discounted fee is INR "+final_fee);
			
	}
}
