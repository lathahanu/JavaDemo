package ControlStatement;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// find the largest number
		
		int a = 21;
		int b = 45;
		int c = 96;
		
		if(a>b && a>c) {
			System.out.println("the largest number is a " + a);
		}
		else if(b>c && b>a) {
			System.out.println("the largest number is b " + b);
		}
		else {
			System.out.println("the largest number is c " + c);
		}
	}
}
