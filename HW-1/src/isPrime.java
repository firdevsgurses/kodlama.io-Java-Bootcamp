
public class isPrime {

	public static void main(String[] args) {
		int number = 5;
		boolean flag = true; // basta asal
		for(int i = 2;i<number;i++) {
			if(number % i == 0) {
				flag = false; // false oldugunda asal degil
			}	
		}
		if(number < 0) {
			System.out.println("invalid entry!");
			return;
		}
		if(number == 1) {
			System.out.println("number is not prime");
			return;
		}
		if(number == 0) {
			System.out.println("number is not prime");
			return;
		}
		if(flag) {
			System.out.println("number is prime");
		}
		else
			System.out.println("number is not prime");
		
	
	}	
}