
public class loopsDemo {
	public static void main(String[] args) {
	
	int i;
	for(i=1;i<10;i++) {
		System.out.println("i = " + i);
	}
	System.out.println("End of for loop when i is = " + i);
	
	i = 1;
	while(i < 10) {
		System.out.println("i = " + i);
		i++;
	}
	System.out.println("End of while loop when i is = " + i);
	
	i = 1;
	do {
		System.out.println("i = " + i);
		i++;
	}while(i<10);
	System.out.println("End of do-while loop when i is = " + i);
	
	
	
	
	}
}
