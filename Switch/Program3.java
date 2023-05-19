import java.io.*;

class NegNotAllowed {

	public static void main(String[] args)throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter First Number:");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter Second Number:");
		int num2 = Integer.parseInt(br.readLine());

		if(num1>0&&num2>0){

			int num = num1*num2;
			System.out.println("Product: "+num);
			if(num%2==0){
				num = 2;
			}else{
				num = 1;
			}
			switch(num) {
	
				case 1:
					System.out.println("Odd");
					break;
				case 2:
					System.out.println("Even");
					break;
			}

	
		}else {

			System.out.println("Sorry negative numbers Not Allowed");
		}
	}	
}
