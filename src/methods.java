
public class methods {

	public static void main(String[] args) {
		findNumber();
	}
	public static void findNumber() {
		int numbers[] = new int[] {1, 3, 6, 12, 7};
		int aim = 1;
		//my solution;
		boolean flag = false;
		for(int i = 0; i<numbers.length; i++) {
			if(aim == numbers[i]) {
				flag = true;
				break;
			}
		}
		if(flag) {
			sendMessage(aim);
		}
		else
			System.out.println("no matching number: " + aim);
	}
	public static void sendMessage(int aim) {
		System.out.println("number was found: " + aim);
	}
	
	
}
