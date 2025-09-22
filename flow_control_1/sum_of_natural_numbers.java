package flow_control_1;
import java.util.*;


public class sum_of_natural_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0) {
			int sum = (number*(number+1))/2 ;
			System.out.println("The sum of "+number+" natural numbers is "+sum +"\n"
					+ "");
		}
		else System.out.println("The number "+number+" is not a natural number\r\n"
				+ "");
		
		sc.close();
		}
}
