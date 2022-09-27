
public class recapDemo1 {

	public static void main(String[] args) {
		int firstNum = 20;
		int secondNum = 12;
		int thirdNum = 43; 
		// my solution;
		int temp = firstNum;
		if(temp < secondNum) {
			temp = secondNum;
		}
		if(temp < thirdNum) {
			temp = thirdNum;
		}
		System.out.println("max is: " + temp);
		// hocayla aynı cıktı :D
		
	}
}
