package encapsulation;

public class Test1 {

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.getEmailid());
		t.setEmailid("java@gmail.com");
		System.out.println(t.getEmailid());
	}

}
