package conditionalStatament;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the day numb");
	int day=s.nextInt();
	switch(day) {
	case 1:System.out.println("Monday");
	break;
	case 2:System.out.println("Tuesday");
	break;
	case 3:System.out.println("Wednesday");
	break;
	case 4:System.out.println("Thrusday");
	break;
	case 5:System.out.println("Friday");
	break;
	case 6:System.out.println("Saturday");
	break;
	case 7:System.out.println("Sunday");
	break;
	default:System.out.println("WRONG NUMB");
	break;
	}
	

	}

}
