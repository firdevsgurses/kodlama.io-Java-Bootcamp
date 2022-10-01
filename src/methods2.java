
public class methods2 {

	public static void main(String[] args) {
//		add();
//		delete();
//		update();
		String message = "Bugun hava cok guzel.";
		String newMessage = message.substring(0,5);
		System.out.println(newMessage);
		String newMessage1 = city();
		System.out.println(newMessage1);
		int summation = sum(44,7);
		System.out.println(summation);
		int toplam = multipleSum(1,2,4,6,8,12);
		System.out.println(toplam);
	
	}
	public static void add() {
		System.out.println("added!");
	}
	public static void delete() {
		System.out.println("deleted!");
	}
	public static void update() {
		System.out.println("updated!");
	}
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int multipleSum(int... sayilar) {
		int sum = 0;
		for(int sayi:sayilar) {
			sum+=sayi;
		}
		return sum;
	}
	public static String city() {
		return "Ankara";
	}

}
