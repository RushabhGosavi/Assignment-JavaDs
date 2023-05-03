/* Program to check no from 0 to 5 and print its spelling, 
 if no is greater than 5 print no is greater than 5 */

class SpellNo {

	public static void main(String[] args) {

		int var = -6;

		if(var>5) {

			System.out.println("Number is greater than 5");
		}else if(var==0) {

			System.out.println("Zero");
		}else if(var==1) {

			System.out.println("One");
		}else if(var==2) {

			System.out.println("Two");
		}else if(var==3) {

			System.out.println("Three");
		}else if(var==4) {

			System.out.println("Four");
		}else if(var==5) {
		
			System.out.println("Five");	
		}else {

			System.out.println("No is negative");
		}
	}
}
