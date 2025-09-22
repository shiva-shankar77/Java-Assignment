package Java_elements;
import java.util.*;
public class converting_thefeet_into_yard_and_miles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int feet = sc.nextInt();
		double yard =(double)feet/3;
		double mile =yard/1760;
		System.out.println("The distance is feet "+feet+" while yard is "+yard+" and in miles "+mile);
		sc.close();
		
	}

}
