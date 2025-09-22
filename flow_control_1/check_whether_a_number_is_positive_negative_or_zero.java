package flow_control_1;
import java.util.*;

public class check_whether_a_number_is_positive_negative_or_zero {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int number = sc.nextInt();
	  if(number>0) System.out.println("Positive");
	  else if(number==0) System.out.println("Zero");
	  else System.out.println("Negative");
	  sc.close();
	  
  }
}
