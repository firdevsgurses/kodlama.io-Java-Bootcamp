
public class friendNumbers {

	public static void main(String[] args) {
		int firstNum = 220;
		int secondNum = 284;
		int firstSum = 0;
		int secondSum = 0;
		for(int i = 1;i<firstNum;i++) {
			if(firstNum % i == 0) {
				firstSum += i;
			}
		}
		for(int i = 1;i<secondNum;i++) {
			if(secondNum % i == 0) {
				secondSum += i;
			}
		}
		//my solution
		if(firstNum == secondSum && secondNum == firstSum) {
			System.out.println("friend numbers");
		}
		else 
			System.out.println("not friends");
		
		
		
		
	}

}
