package interface1;

public class Test1 implements Test0{

	@Override
	public void cardSlot() {
		System.out.println("cardslot");
		
	}

	@Override
	public void pin() {
		System.out.println("pin");
		
	}

	@Override
	public void cash() {
		System.out.println("cash");
		
	}
public static void main(String[] args) {
	Test1 t=new Test1();
	t.cardSlot();
	t.pin();
	t.cash();
}
	

}
