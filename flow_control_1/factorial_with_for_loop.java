package flow_control_1;
import java.util.*;
public class factorial_with_for_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial =1;
		for(int i = number;i>0;i--){
			factorial*=i;
			}
		if(factorial>0) System.out.println(factorial);
		
		sc.close();
		}
}
