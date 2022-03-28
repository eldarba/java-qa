package c;

public class Test {

	public static void main(String[] args) {
		
		Printer printer = new Printer() {
			
			@Override
			public void print() {
				System.out.println("LaLaLa");
				
			}
		};
		
		printer.print();

	}

}
