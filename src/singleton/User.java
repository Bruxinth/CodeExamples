package singleton;

/* This class makes use of the singletonclass to demonstrate that the class is functional */

public class User {

	public static void main(String[] args) {
		
		SingletonClass object = SingletonClass.getInstance();
		
		System.out.println(object.getState());
		
		object.setState("New State");
		
		System.out.println(object.getState());

	}

}
