package ControlStatement;

public class Break_Continue_Statement {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println("Hello.." + i );
				
			if(i==5) {
				System.out.println("Reached 5th iteration");
				break;
			} 
			
		/*	if(i==4 | i==6) {
				System.out.println("continue statement");
				continue;
			} */
		}
	}
}
