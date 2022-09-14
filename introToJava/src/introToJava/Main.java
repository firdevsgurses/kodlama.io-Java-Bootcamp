package introToJava;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		String ilkMetin = "ilginizi cekebilir";
		String ikinciMetin = "Vade suresi";
		System.out.println(ilkMetin);
		System.out.println(ikinciMetin);
		int vade = 12;
		double  dolarDun = 18.30;
		double dolarBugun = 18.30;
		boolean dolarDustuMu = true;
		String okYonu = "";
		if (dolarBugun < dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
			
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		//String kredi1 = "Hizli Kredi";
		//String kredi2 = "Kredi X";
		//String kredi3 = "Kredi Y";
		String[] krediler = {"hizli kredi", "maasini halkbanktan alanlar", "mutlu emekli"};
		//System.out.println(krediler[0]);
		//System.out.println(krediler[1]);
		//System.out.println(krediler[2]);
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler [i]);
		}

	}
}
