/*Program to reverse given no */

class Rev {

	public static void main(String[] args) {

		int n = 942111423;
		int rev = 0;
		int temp = n;

		while(n!=0) {

			int rem = n%10;
			n = n/10;
			rev = rev*10+rem;
		}
		System.out.println(rev);
	}
}

