package flow_control_1;
import java.util.*;

public class count_down_of_the_numbers_in_reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int counter = number;
		while(counter>0) {
			System.out.println(counter--);
		}
		sc.close();
		
	}

}
