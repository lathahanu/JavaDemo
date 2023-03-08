package Default;

public class Basics {

//	int x = 20;  // Instance variable
	
//	static int y = 50;  // Static variable
	
/*	public void samplemethod() {
		
		int z = 90;  // Local variable. we can only use this variable within this samplemethod Method only.
		System.out.println("This is an Instance method");
	}
*/	
	          //Main Method
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		
	/*	int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	*/
		// create the object to access the variable in class and outside of Main method 
		Basics objref = new Basics();
		
		System.out.println(objref.x);
		
	//	objref.samplemethod();
		
	//	System.out.println(y);
		
	//	System.out.println(objref.x + "\t" + y);
		
	}

}
