package Java_elements;

public class volume_of_earth {
	public static void main(String[] args) {
		int km=6378;
		//1.6km=1mile
		double mile=6378/1.6;
		double volume_in_km=(4/3)*(3.14)*km*km*km;
		double volume_in_mile=(4/3)*(3.14)*mile*mile*mile;
		System.out.println(" The volume of earth in cubic kilometers is "+volume_in_km+" and cubic miles is "+volume_in_mile);
	}
}
