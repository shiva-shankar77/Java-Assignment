package Java_elements;
import java.util.*;
public class area_of_triangle_in_cm_inch_feet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base_in_cm=sc.nextDouble();
		double height_in_cm=sc.nextDouble();
		double area_in_cm=(0.5)*base_in_cm*height_in_cm;
		double area_in_inches=area_in_cm/2.56;
		double area_in_feet=area_in_inches/12;
		System.out.println("Your area of triangle in cm is "+area_in_cm+" while in feet is "+area_in_feet+" and inches is "+area_in_inches);
		sc.close();
	}

}
