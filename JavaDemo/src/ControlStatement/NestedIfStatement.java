package ControlStatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 25;
		
		if (a == 10) {
			
			if(b==20) {
				System.out.println("the given number is 20");
			}
			System.out.println("the given numer is 10");
		}
		else {
			System.out.println("the number is incorrect");
		}

	}

}
