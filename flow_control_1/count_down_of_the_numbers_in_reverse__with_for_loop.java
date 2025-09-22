package flow_control_1;
import java.util.*;
public class count_down_of_the_numbers_in_reverse__with_for_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i=number;i>0;i--) {
			System.out.println(i);
		}
		if(number<0) System.out.println("Given number is not valid");
		sc.close();
	}

}
