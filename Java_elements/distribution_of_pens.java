package Java_elements;

public class distribution_of_pens {
	public static void main(String[] args) {
	int total_pens = 14;
	int total_students =3;
	int each =total_pens/total_students;
	int remaining_pens = total_pens%total_students;
	System.out.println("The Pen Per Student is "+ each+" and the remaining pen not distributed is "+remaining_pens );

}
}
