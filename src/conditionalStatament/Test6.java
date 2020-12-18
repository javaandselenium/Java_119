package conditionalStatament;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=s.nextInt();
		switch(marks)
		{
		case 1:System.out.println("Grade A");
		break;
		case 2:System.out.println("Grade B");
		break;
		case 3:System.out.println("Grade C");
		break;
		}
		
		

	}

}
