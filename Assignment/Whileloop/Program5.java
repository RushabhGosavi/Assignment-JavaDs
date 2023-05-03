/* Program to print square of even digits of given no */

class SquareEven {

	public static void main(String[] args) {

		int n = 942111423;
		int i = 0;
		int c = 0;

		while(n!=0) {

			i = n%10;
			n = n/10;
			if(i%2==0) {

				System.out.println(i*i);
			}
		}
	}
}
