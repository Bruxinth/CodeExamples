package proxy;

public class Proxy implements ProxyFunctions {
	
	Real realObject;
	
	public Proxy() {
		
	}
	
	public Proxy(String directory, String filename) {
		accessFile(directory, filename);
	}

	public void accessFile(String directory, String filename) {
		realObject = new Real(directory, filename);
	}
	
	public String readFile() {
		return realObject.readFile();
	}
	public void writeToFile(String text){
		realObject.writeToFile(text);
	}
	
	public void closeFile() {
		realObject.closeFile();
		realObject = null;
	}
}
