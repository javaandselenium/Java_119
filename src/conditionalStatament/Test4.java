package conditionalStatament;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=s.nextInt();
		if(marks>=90) {
			System.out.println("Grade A+");
		}
		else if(marks>=70) {
			System.out.println("Grade A");
		}
		else if(marks>=60) {
			System.out.println("Grade B");
		}
		else if(marks>=40) {
			System.out.println("Grade C");
		}
		else if(marks>=20) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
	}

}
