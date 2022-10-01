
public class findNumber {

	public static void main(String[] args) {
		int numbers[] = new int[] {1, 3, 6, 12, 7};
		int aim = 13;
		//my solution;
		boolean flag = false;
		for(int i = 0; i<numbers.length; i++) {
			if(aim == numbers[i]) {
				flag = true;
			}
		}
		if(flag == true) {
			System.out.println("number was found");
		}
		else
			System.out.println("no matching number");
	}

}
