
public class isPerfect {

	public static void main(String[] args) {
		//my solution
		int number = 25;
		int sum = 0;
		int remainder;
		for(int i = 1;i<number;i++) {
			remainder = number % i;
			if(remainder == 0){
				sum += i;
			}
		}
		if(sum == number) {
			System.out.println("number is perfect");
		}
		else 
			System.out.println("number is not perfect");
		
	}

}
