package flow_control_1;
import java.util.*;

public class smallest_one_of_a_b_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		int c  = sc.nextInt();
		if(a<b && a<c) System.out.println("Is the first number is smallest yes");
		else System.out.println("Is the first number is smallest no");
	    sc.close();
	}
}
