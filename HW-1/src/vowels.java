
public class vowels {

	public static void main(String[] args) {
		//my solution
		char[] letters = {'a', 'e', 'u', 'o', 'i'};
		for(char letter:letters) {
			if(letter == 'e' || letter == 'i') {
				System.out.println("thin vowels");
			}
			else 
				System.out.println("bold vowels");
		}

	}
}