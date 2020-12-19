package arrays;

public class Test3 {

	public static void main(String[] args) {
	int a[]=new int[5];
	a[4]=100;
	a[3]=50;
	a[1]=10;
	a[0]=30;
	a[2]=40;
	
	System.out.println(a[4]);
	System.out.println(a[1]);
	System.out.println(a[3]);
	
	for(int i=0;i<=4;i++) {
		System.out.println(a[i]);
	}
	
	

	}

}
