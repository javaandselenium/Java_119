package methods;

public class Phone1 extends Phone{
	
	public void camera() {
		System.out.println("front and back camera");
		super.camera();
	}

	public static void main(String[] args) {
	Phone1 p=new Phone1();
	p.camera();

	}

}
