/* Program to count Odd digits of given no */

class OddCount {

	public static void main(String[] args) {

		int n = 942111423;
		int i = 0;
		int c = 0;

		while(n!=0) {

			i = n%10;
			n = n/10;
			if(i%2!=0)
				c++;
		}
		System.out.println(c);
	}
}
