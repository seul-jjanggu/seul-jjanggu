package D0416_class;

interface Printable2 {
	void print(String doc);
	default void printCMYK(String doc) { }
}

class Prn731Drv2 implements Printable2 {
	@Override
	public void print(String doc) {
		System.out.println("Form MD-731 printer");
		System.out.println(doc);
	}
}

class Prn909Drv implements Printable2 {
	@Override
	public void print(String doc) {
		System.out.println("From MD-909 black & white ver");
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}

class PrrinterDriver4 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printable2 prn1 = new Prn731Drv2();
		prn1.print(myDoc);
		System.out.println();
		
		Printable2 prn2 = new Prn909Drv();
		prn2.print(myDoc);
	}
}
