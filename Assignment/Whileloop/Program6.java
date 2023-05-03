/* Program to print sum of all even no and mul of odd no between 1 to 10 */

class SumEvenMulOdd {

	public static void main(String[] args) {

		int n = 10;
		int i = 1;
		int sum = 0;
		int mul = 1;

		while(i<=n) {
			if(i%2==0) {
				sum = sum+i;
			} else {
				mul = mul*i;
			}
			i++;
		}
		System.out.println("sum of even no between 1 to 10 = "+sum);		
		System.out.println("Multiplication of no between 1 to 10 = "+mul);
	}
}


