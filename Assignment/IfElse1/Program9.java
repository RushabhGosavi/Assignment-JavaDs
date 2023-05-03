/* Program to accept 3 no and check whether they are Pythagorean triplets or not */

class Pythagorean {

	public static void main(String[] args) {

		int a = 2;
		int b = 2;
		int c = 2;

		if(a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b)
			System.out.println("It is Pythagorean Triplet");
		else 
			System.out.println("It is not Pythagorean Triplet");	
	}
}
