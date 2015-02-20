package singleton;
/* The following code is meant to demonstrate the use of the singleton pattern.
 * In the future, I think this design would be good for use as an interface to a network socket class, since
 * only one socket is needed at any one time.
 * What the class here does is hide the constructor from the other classes so that the class itself is the
 * only way access the objects created from this class, in order to control the amount of objects created.
 * This could be used to house multiple objects, although I don't see the benefit at the moment, and can be
 * used as a semaphore to control operating system resources such as access to a particular file.*/


public class SingletonClass {
	private static SingletonClass singleton = new SingletonClass();
	private String stateString;
	
	private SingletonClass() {
		this.stateString ="default";
		
	}
	
	public static SingletonClass getInstance() {
		return singleton;
	}
	
	public String getState(){
		return stateString;
	}
	
	public void setState(String state) {
		this.stateString = state;
	}
}
