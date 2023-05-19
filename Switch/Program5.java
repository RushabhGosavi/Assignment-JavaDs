import java.io.*;

class RealTime {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Where Do you Wish to Visit For Vaccation?");
		System.out.println("1.Hill Station");
		System.out.println("2.Water Park");
		
		System.out.println("Enter your choice:");
		int ch = Integer.parseInt(br.readLine());

		switch(ch){


			case 1: {
				
				System.out.println("Hill Station's");
				System.out.println("1.Matheran");
				System.out.println("2.Mahabaleshwar");
				System.out.println("3.Ladakh");
				System.out.println("4.Dehradun");

				System.out.println("Enter Hill Station of your choice:");
				int ch1 = Integer.parseInt(br.readLine());

				switch(ch1){

					case 1:
						System.out.println("Matheran");
						break;
					case 2:
						System.out.println("Mahabaleshwar");
						break;
					case 3:
						System.out.println("Ladakh");
						break;
					case 4:
						System.out.println("Dehradun");
						break;
					default:
						System.out.println("Not Available");
						break;
				}
				break;
			}
			case 2: {

				System.out.println("Water Parks:");	
				System.out.println("1.Imagica");
				System.out.println("2.Wet n Joy");
				System.out.println("3.Essel World");
				System.out.println("4.Disney Land");

				System.out.println("Enter Water Park you want to visit:");
				int ch2 = Integer.parseInt(br.readLine());

				switch(ch2){

					case 1:
						System.out.println("Imagica");
						break;
					case 2:
						System.out.println("Wet N Joy");
						break;
					case 3:
						System.out.println("Essel World");
						break;
					case 4:
					        System.out.println("Disney World");
				                break;	
					default:
						System.out.println("Not Available");
						break;	
				}
				break;
			}
		}
	}
}

