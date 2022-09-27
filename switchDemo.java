
public class switchDemo {

	public static void main(String[] args) {
		 char grade = 'F';
		 switch(grade) {
		 case 'A':
			 System.out.println("Perfect!");
			 break;
		 case 'B':
			 System.out.println("Nice!");
			 break;
		 case 'C':
			 System.out.println("Okay!");
			 break;
		 case 'D':
			 System.out.println("Not Bad!");
			 break;
		 case 'F':
			 System.out.println("Fail!");
			 break;
		 default:
			 System.out.println("Invalid grade entry!");
		 }
		 

	}

}
