
public class classes {

	public static void main(String[] args) {
		CustomerManager customerManager; //customerManager turunde kullanim yapmak
		CustomerManager customerManager1 = new CustomerManager();
		customerManager = customerManager1;
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();
		//new heap'te nesneye yer acar
		 int num1 = 10;
		 int num2 = 20;
		 num2 = num1; // num2 = 10;
		 num1 =30;
		 // num1 = 30, num2 = 10;
		 System.out.println("number 1: " + num1 + "\n" + "number 2: " + num2);
		 
		 int numbers[] = new int[] {1, 2, 3};
		 int numbers1[] = new int[] {4, 5, 6};
		 numbers1 = numbers;
		 numbers[0] = 10;
		 // numbers1[] = {1, 2, 3}
		 // numbers[] = {10, 2, 3} 
		 System.out.println("numbers array: ");
		 for(int number:numbers) {
			 System.out.println(number);
		 }
		 System.out.println("numbers1 array: ");
		 for(int number:numbers1) {
			 System.out.println(number);
		 }
		 
		
		
		
		
	}
}

