package Java_elements;
import java.util.*;
public class hegiht_in_cm_convert_to_inch_and_feet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height_in_cm=sc.nextDouble();
		double height_in_inch=height_in_cm/2.54;
		double height_in_feet=height_in_inch/12;
		System.out.println(" Your Height in cm is "+height_in_cm+" while in feet is "+height_in_feet+" and inches is"+height_in_inch);
		sc.close();
	}
}
