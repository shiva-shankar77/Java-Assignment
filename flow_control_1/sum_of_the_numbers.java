package flow_control_1;
import java.util.*;

public class sum_of_the_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		while(number>0) {
			sum+=number;
			int temp = sc.nextInt();
			number =temp;			
		}
		System.out.println(sum);
		sc.close();		
	}
}
