package flow_control_1;
import java.util.*;
public class factorial_with_while_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
	    int factorial = 1;
	    while(number>0) {
	    	factorial*=number;
	    	number--;
	    }
	    if (factorial>1) System.out.println(factorial);
	    else System.out.println("Given number is not valid");
	    sc.close();
	}

}
