package arrays;

public class Test7 {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=90;
		a[3]=50;
		
		for(int i=0;i<=3;i++) {
			System.out.println(a[i]);
		}
		for(int s:a)
		{
			System.out.println(s);
		}

	}

}
