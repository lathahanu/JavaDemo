package ControlStatement;

public class Switchdemo {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("I got grade A");
			break;
		case 'B':
			System.out.println("I got grade B");
			break;
		case 'C':
			System.out.println("I got grade C");
			break;
		case 'D':
			System.out.println("I got grade D");
			break;
		default:
			System.out.println("Oops.. I failed ");
			break;
			
		}
	}
}
