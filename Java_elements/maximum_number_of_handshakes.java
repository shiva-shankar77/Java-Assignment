package Java_elements;
import java.util.*;
public class maximum_number_of_handshakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_students = sc.nextInt();
		int hand_shakes = (total_students*(total_students-1))/2;
		System.out.println("Total number of hand shakes "+hand_shakes);
		sc.close();
	}

}
