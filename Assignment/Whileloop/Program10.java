/*Program to check wheter no is palindrome no or not */

class Palindrome {

	public static void main(String[] args) {

		int n = 2332;
		int rev = 0;
		int temp = n;

		while(n!=0) {

			int rem = n%10;
			n = n/10;
			rev = rev*10+rem;
		}
		if(temp==rev) {

			System.out.println(rev+" is palindrome Number");
		}	
	}
}

