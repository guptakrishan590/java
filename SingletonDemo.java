
class Printer{
	private Printer() {}
	private static Printer printer ;
	public void show() {
		System.out.println("show");
	}
	public static Printer getObject() {
		if(printer==null) {
			printer = new Printer();
		}
		return printer;
	}
	
}

public class SingletonDemo {
	public static void main(String[] args) {
		Printer printer1 = Printer.getObject();
		printer1.show();
	}

	
 	
}
