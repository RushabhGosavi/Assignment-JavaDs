import java.io.*;

class Number{

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter a No:");
		int num = Integer.parseInt(br.readLine());

		if(num<0)
			num = 6;
		switch(num) {

			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Number is Negative");
				break;
			default:
				System.out.println("Number is greater than 5");
				break;
		}
	}
}
