package conditionalStatament;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter the age");
		int age = s.nextInt();
		if (age > 18) {
			System.out.println("Casting the vote");
		} else {
			System.out.println("Cannot cast the vote");
		}

	}

}
