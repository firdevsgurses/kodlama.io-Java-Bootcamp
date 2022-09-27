
public class arraysDemo {

	public static void main(String[] args) {
		String[] students = new String[3];
		students[0] = "Firdevs";
		students[1] = "Irem";
		students[2] = "Rezzan";
		
		for(int i = 0;i < students.length; i++) {
			System.out.println((i+1)+". student: " + students[i]);
		}
		System.out.println("------------------------");
		for(String student:students) {
			System.out.println("student: " + student);
		}
	}

}
