package proxy;

import java.io.IOException;

public class User {
	static Proxy proxyObject = new Proxy();
	
	public static void main(String[] args) {
	
	proxyObject.accessFile("../CodeExamples/src/proxy","Access");
	
	System.out.println(proxyObject.readFile());
	
	proxyObject.writeToFile("A line of text");
	
	System.out.println(proxyObject.readFile());
	
	try {
		System.in.read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	proxyObject.closeFile();
	}
}
