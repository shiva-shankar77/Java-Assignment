package flow_control_1;
import java.util.*;


public class largest_one_of_a_b_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Is the first number the largest? yes \r\n"
					+ "Is the second number the largest? no \r\n"
					+ "Is the third number the largest? no \r\n"
					+ "");
		}
		else if(b>c) {
			System.out.println("Is the first number the largest? no \r\n"
					+ "Is the second number the largest? yes \r\n"
					+ "Is the third number the largest? no \r\n"
					+ "");			
		}
		else {
			System.out.println("Is the first number the largest? no \r\n"
					+ "Is the second number the largest? no \r\n"
					+ "Is the third number the largest? yes \r\n"
					+ "");
		}
		sc.close();
	}

}
