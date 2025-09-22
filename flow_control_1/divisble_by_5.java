package flow_control_1;
import java.util.*;
 
public class divisble_by_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number%5==0) {
			System.out.println("Is the number "+number+"divisble by 5, yes");
		}
		else System.out.println("Is the number "+number+"divisble by 5, no");
       sc.close();
	}
}
