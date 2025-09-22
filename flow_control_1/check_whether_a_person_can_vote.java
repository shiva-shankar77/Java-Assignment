package flow_control_1;
import java.util.*;
public class check_whether_a_person_can_vote {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int age = sc.nextInt();
	  if(age>17) {
		  System.out.println("The person's age is "+age+" can vote");
	  }
	  else System.out.println("The person's age is "+age+" cannot vote");
	  sc.close();
  }
}
