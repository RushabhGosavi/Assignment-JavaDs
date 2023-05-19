import java.io.*;

class StudentsReport {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter your Marks:");

		System.out.println("Marathi :");
		int mar = Integer.parseInt(br.readLine());

		System.out.println("Science :");
		int sci = Integer.parseInt(br.readLine());

		System.out.println("Maths :");
		int math = Integer.parseInt(br.readLine());
		
		System.out.println("History :");
		int his = Integer.parseInt(br.readLine());
		
		System.out.println("Geography :");
		int geo = Integer.parseInt(br.readLine());

		char ch ='a';
		if(mar>=35&&sci>=35&&math>=35&&his>=35&&geo>=35) {

			int avg = (mar+sci+math+his+geo)/5;

			if(avg>=75) {

				ch ='A';
			}else if(avg>=60){

				ch ='B';
			}else if(avg>=50){

				ch ='C';
			}else if(avg>=40){

				ch ='D';
			}else if(avg>=35){

				ch ='E';
			}
			
			System.out.println("Average is: "+avg);
			switch(ch){
				case'A':
					System.out.println("First Class With Distinction");
					break;
				case'B':
					System.out.println("First Class");
					break;
				case'C':
					System.out.println("Second Class");
					break;
				case'D':
					System.out.println("Satisfactory");
					break;
				case'E':
					System.out.println("Pass");
					break;
			}	
		}else {
			System.out.println("You are Fail");
		}


	}
}
