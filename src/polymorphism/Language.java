package polymorphism;

public class Language {
public void movie() {
	System.out.println("watching movie");
}
}

class English extends Language{
	public void movie() {
		System.out.println("watching english movie");
	}
}

class Hindi extends Language{
	public void movie() {
		System.out.println("watching hindi movie");
	}
}


class Kannada extends Language{
	public void movie() {
		System.out.println("watching kannada movie");
	}
}