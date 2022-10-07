package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger{
	@Override //bir interface'ten geldigini soyler
	public void log(String data) {
		System.out.println("logged into the file: " + data);
		
	}
	
	

}
