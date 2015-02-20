package proxy;
import java.io.*;

class Real implements ProxyFunctions {
	
	private File file;
	private FileReader reader;
	private FileWriter writer;
	
	Real(String directory, String filename) {
		try {
		file = new File(directory, filename);
		reader = new FileReader(file);
		writer = new FileWriter(file,true);
		
		}
		catch (Exception e) {
			System.out.println("File does not already exist.");
		}
	}
	
	public String readFile() {
		char[] buffer = new char[0];
		try {
			reader.read(buffer);
		}
		catch (Exception e) {
			System.out.println("Could not read from file.");
		}
			return String.valueOf(buffer);
	}
	
	public void writeToFile(String text) {
		try {
			writer.write(text);
		}
		catch (Exception e) {
			System.out.println("Could not write to file.");
		}
	}
	
	public void closeFile() {
		try {
			reader.close();
			writer.close();
		}
		catch (Exception e) {
			System.out.println("Error Closing File.");
		}
	}
}
