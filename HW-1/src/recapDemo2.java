
public class recapDemo2 {

	public static void main(String[] args) {
		double[] myList = new double[4];
		double total = 0;
		double max = 0;
		//my solutions
		myList[0] = 1.2;
		myList[1] = 2.3;
		myList[2] = 3.4;
		myList[3] = 4.5;
		for(double item:myList) {
			System.out.println(item);
			total += item;
			if(item > max) {
				max = item;
			}
		}
		System.out.println("total is: " + total);
		System.out.println("max is: " + max);

	}

}
