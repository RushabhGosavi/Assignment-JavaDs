/* Program to calculate factorial of given no */

class Factorial {

	public static void main(String[] args) {

		int i = 1;
		int n = 6;
		int ans = 1;

		while(i<=n) {
			
		        ans = ans*i;
			i++;
		}
	
			System.out.println("Factorial "+n+" is "+ans);

	}
}
