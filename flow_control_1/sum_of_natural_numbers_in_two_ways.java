package flow_control_1;
import java.util.Scanner;

public class sum_of_natural_numbers_in_two_ways {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int number = sc.nextInt();
		  int sum =0,total=0;
		  if(number>0) {
			  total=(number*(number+1))/2;
		  }
		  while(number>0) {
			  sum+=number;
			  number--;
		  }
		  if(sum == total) System.out.println(sum);
		  if(number<0) System.out.println("Given value is not a natural number");
		  sc.close();
	}
}
