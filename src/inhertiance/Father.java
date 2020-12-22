package inhertiance;

public class Father extends GrandFather{
	
	public void car() {
		System.out.println("car is the property from parent");
	}
	
	public static void main(String[] args) {
		Father f=new Father();
		f.car();
		f.home();
	}

}
