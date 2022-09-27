
public class stringsDemo {

	public static void main(String[] args) {
		String message = "Bugun hava cok guzel.";
		System.out.println(message);
//		System.out.println("eleman sayisi = " + message.length());
//		System.out.println("7. eleman = " + message.charAt(7));
//		System.out.println(message.concat(" yasasin!!"));
//		System.out.println(message); // yasasin da yazsin istiyosak baska bir degisken olusturmaliyiz
//		System.out.println(message.startsWith("B")); // bolean
//		System.out.println(message.startsWith("A"));
//		System.out.println(message.endsWith("l"));
//		char[] karakterler = new char[5];
//		message.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(message.indexOf('a'));
//		System.out.println(message.indexOf("av"));
//		System.out.println(message.lastIndexOf("a"));
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(6));
		System.out.println(message.substring(2, 5));
		System.out.println("----------");
		for(String word : message.split(" ")) {
			System.out.println(word);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());//veri tabanina arama ifadesi yolladigimizda
		System.out.println(message.trim()); //basta ve sondaki bosluklari siler
		
		

	}
}