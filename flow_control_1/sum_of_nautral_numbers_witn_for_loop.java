package flow_control_1;
import java.util.*;
public class sum_of_nautral_numbers_witn_for_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum =0,total=0;
		if (number>0) sum=(number*(number+1))/2;
		for(int i =number ; i>0;i--) {
			total+=i;
		}
		if(sum==total) System.out.println(sum);
		else System.out.println("Given input is invalid");
		sc.close();
	}

}
