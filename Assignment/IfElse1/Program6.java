/* Program to find maximum between 3 no */

class Max3 {

	public static void main(String[] args) {

		int num1 = 42;
		int num2 = 32;
		int num3 = 42;

		if(num1>num2 && num1>num3)
			System.out.println(num1+" is maximum between "+num1+","+num2+" and "+num3);
		else if(num2>num1 && num2>num3)
			System.out.println(num2+" is maximum between "+num1+","+num2+" and "+num3);
		else if(num3>num1 && num3>num2)
			System.out.println(num3+" is maximum between "+num1+","+num2+" and "+num3);
		else if(num1>num2 && num1==num3)
			System.out.println(num1+" is Greater than "+num2+" and Equal to "+num3);
		else if(num2>num3 && num2==num1)
			System.out.println(num2+" is Greater than "+num3+" and Equal to "+num1);
		else if(num3>num1 && num3==num2)
			System.out.println(num3+" is Greater than "+num1+" and Equal to "+num2);
		else
			System.out.println("All are Equal");

	}
}
				
